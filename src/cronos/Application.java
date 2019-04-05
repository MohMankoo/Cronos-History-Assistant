/**
 * The Application class holds the core components of the Cronos program
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Application extends CronosPanel {

	// Toolbar Components
	private JToolBar toolbar;
	private JButton home, wiki, options;
	private Box tabs;
	private JButton tab1, tab2, tab3;
	
	private CardLayout appPageSwitcher;
	private Civilization[] appPages;

	// Class Constants
	// The toolbar buttons
	public static final int HOME_BUTTON = 0;
	public static final int WIKI_BUTTON = 1;
	public static final int OPTIONS_BUTTON = 2;
	public static final int TAB1 = 3;
	public static final int TAB2 = 4;
	public static final int TAB3 = 5;
	
	// The app pages associated with the Application
	public static final int MAP_PAGE = -1;
	
	// Padding constants used in tab JButtons
	public static final String SINGLE_TAB_PADDING = "                                  "
			+ "                                  "
			+ "                                  ";
	public static final String DOUBLE_TAB_PADDING = "                                      ";
	public static final String TRIPLE_TAB_PADDING = "                            ";

	public Application(Civilization[] appPages, Controller controller) {
		
		super(controller);
		
		this.appPages = appPages;
		this.configureAppPages();
	}
	
	// Called by the super constructor
	@Override
	protected void buildComponents() {

		this.appPageSwitcher = new CardLayout();
		this.setLayout(appPageSwitcher);
		
		home = new JButton( new ImageIcon("assets/homeButton.png"));
		wiki = new JButton( new ImageIcon("assets/wikiButton.png"));
		options = new JButton( new ImageIcon("assets/optionsButton.png"));
		
		setupToolBarButton(home, "Home");
		setupToolBarButton(wiki, "Wikipedia");
		setupToolBarButton(options, "Options");
		
		// Set up the tab buttons
		tab1 = new JButton();
		tab2 = new JButton();
		tab3 = new JButton();
		
		setupToolBarButton(tab1, null);
		setupToolBarButton(tab2, null);
		setupToolBarButton(tab3, null);
		
		tabs = Box.createHorizontalBox();
		tabs.setPreferredSize( new Dimension(900, 25));
		tabs.add(tab1);
		tabs.add(tab2);
		tabs.add(tab3);
		
		configureTabs(Application.CONFIG_HOME); // Configure the tab buttons
		
		// Toolbar is added to the GUI in Main.java
		toolbar = new JToolBar();
		toolbar.setFloatable(false);
		toolbar.setBackground(Color.WHITE);
		
		// Adds toolbar components to the toolbar
		toolbar.add(home);
		toolbar.add(Box.createHorizontalStrut(50));
		
		toolbar.add(tabs);
		
		toolbar.add(Box.createHorizontalStrut(50));
		toolbar.add(wiki);
		toolbar.add(Box.createHorizontalStrut(15));
		toolbar.add(options);
		
		this.configureMapPage();
	}
	
	private void setupToolBarButton(JButton button, String toolTipText) {
		
		button.addActionListener(getController());
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setToolTipText(toolTipText);
		button.setFont( new Font("Arial", Font.BOLD, 15)); // Only applicable to tab buttons
		button.setCursor( new Cursor( Cursor.HAND_CURSOR));
	}
	
	// Configure state tells which tabset is currently being used
	// Example: south america (maya, inca, aztec) or east asia (japan)
	// It uses constants from WorldMap.java to define itself
	private int configState;
	
	// The types of configurations for configureTabs(int configureType) are defined by these constants
	public static final int CONFIG_HOME = 0;
	public static final int CONFIG_SOUTH_AMERICA = 1;
	public static final int CONFIG_MEDITERRANEAN = 2;
	public static final int CONFIG_MIDDLE_EAST = 3;
	public static final int CONFIG_EAST_ASIA = 4;
	
	public void configureTabs(int configureType) {
		
		switch(configureType) {
		case CONFIG_SOUTH_AMERICA:
			this.configState = WorldMap.SOUTH_AMERICA;
			this.changeTabState(true, true, true);
			tab1.setText(TRIPLE_TAB_PADDING + "MAYA" + TRIPLE_TAB_PADDING);
			tab2.setText(TRIPLE_TAB_PADDING + "INCA" + TRIPLE_TAB_PADDING);
			tab3.setText(TRIPLE_TAB_PADDING + "AZTEC" + TRIPLE_TAB_PADDING);
			break;
			
		case CONFIG_MEDITERRANEAN:
			this.configState = WorldMap.MEDITERRANEAN;
			this.changeTabState(true, true, true);
			tab1.setText(TRIPLE_TAB_PADDING + "EGYPT" + TRIPLE_TAB_PADDING);
			tab2.setText(TRIPLE_TAB_PADDING + "GREECE" + TRIPLE_TAB_PADDING);
			tab3.setText(TRIPLE_TAB_PADDING + "ROME" + TRIPLE_TAB_PADDING);
			break;
			
		case CONFIG_MIDDLE_EAST:
			this.configState = WorldMap.MIDDLE_EAST;
			this.changeTabState(true, true, false);
			tab1.setText(DOUBLE_TAB_PADDING + "MESOPOTAMIA" + DOUBLE_TAB_PADDING);
			tab2.setText(DOUBLE_TAB_PADDING + "INDUS VALLEY" + DOUBLE_TAB_PADDING);
			break;
			
		case CONFIG_EAST_ASIA:
			this.configState = WorldMap.EAST_ASIA;
			this.changeTabState(true, false, false);
			tab1.setText(SINGLE_TAB_PADDING + "JAPAN" + SINGLE_TAB_PADDING);
			break;
			
		default: // CONFIG_HOME
			this.configState = Application.MAP_PAGE;
			this.changeTabState(true, false, false);
			tab1.setText(SINGLE_TAB_PADDING + "HOME" + SINGLE_TAB_PADDING);
			break;
		}
	}
	
	private void changeTabState(boolean tab1State, boolean tab2State, boolean tab3State) {
		
		tab1.setVisible(tab1State);
		tab1.setEnabled(tab1State);
		tab2.setVisible(tab2State);
		tab2.setEnabled(tab2State);
		tab3.setVisible(tab3State);
		tab3.setEnabled(tab3State);
	}

	// Called by buildComponents()
	private void configureMapPage() {
		
		WorldMapController mapController = new WorldMapController(null, this);
		WorldMap map = new WorldMap(mapController);
		mapController.setAssociatedPanel(map);
		
		this.add(map, Integer.toString( Application.MAP_PAGE) );
	}
	
	// Called by constructor
	private void configureAppPages() {
		
		// The ScrollPanes will hold the appPages
		JScrollPane[] appPageScrollers = new JScrollPane[appPages.length];
		
		// Add the appPages to the ScrollPanes
		for (int i = 0; i < appPageScrollers.length; i++)
			appPageScrollers[i] = Civilization.generateInfoScroller(appPages[i]);
		
		// Since the ScrollPanes hold the appPages, they are added instead
		for (int i = 0; i < appPageScrollers.length; i++)
			this.add(appPageScrollers[i], Integer.toString( appPages[i].getCivIdentity()) );
	}
	
	public void showPage(int page) {
		appPageSwitcher.show(this, Integer.toString(page));
	}
	
	// ==============================
	//   Getter and Setter methods
	// ==============================

	public CronosPanel[] getAppPages() {
		return appPages;
	}
	
	public JToolBar getToolbar() {
		return toolbar;
	}
	
	public int getConfigState() {
		return configState;
	}
	
	@Override
	public JButton getCommonButton(int commonButton) {
		
		if(commonButton == 0) // 0 indicates HOME_BUTTON
			return this.home;
		else if(commonButton == 1) // 1 indicates WIKI_BUTTON
			return this.wiki;
		else if(commonButton == 2) // 2 indicates OPTIONS_BUTTON
			return this.options;
		else if(commonButton == 3) // 3 indicates TAB1
			return this.tab1;
		else if(commonButton == 4) // 4 indicates TAB2
			return this.tab2;
		else // 5 indicates TAB3
			return this.tab3;
	}

	@Override
	public void setCommonButton(int commonButton, JButton buttonReplacer) {

		if(commonButton == 0) // 0 indicates HOME_BUTTON
			this.home = buttonReplacer;
		else if(commonButton == 1) // 1 indicates WIKI_BUTTON
			this.wiki = buttonReplacer;
		else if(commonButton == 2) // 2 indicates OPTIONS_BUTTON
			this.options = buttonReplacer;
		else if(commonButton == 3) // 3 indicates TAB1
			this.tab1 = buttonReplacer;
		else if(commonButton == 4) // 4 indicates TAB2
			this.tab2 = buttonReplacer;
		else // 5 indicates TAB3
			this.tab3 = buttonReplacer;
	}

}
