/**
 * This is the main menu of the Cronos application. 
 * It acts as the launcher to the program.
 * 
 * @author Mohpreet Mankoo
 * @since 1.0 
 */

package cronos;

import java.awt.Cursor;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Launcher extends CronosPanel {

	// GUI Components
	private JLabel background, logo;
	private JButton mapButton, exitButton;
	
	// Class Constants
	// Each variable refers to the JLabels the user will view as buttons on the screen
	public static final int MAP_BUTTON = 0;
	public static final int EXIT_BUTTON = 1;

	/**
	 * The constructor organizes and instantiates the components of this class.
	 * It requires a <code>Controller</code> object in its argument.
	 * 
	 * @param controller A controller object that controls the buttons in this class
	 */
	public Launcher(Controller controller) {
		super(controller);
	}

	@Override
	protected void buildComponents() {
		
		this.readyComponents();
		this.organizeComponents();
	}

	// Initializes the fields of this class and sets their properties as needed
	private void readyComponents() {

		// Initialize JLabels
		background = new JLabel( new ImageIcon("assets/background.gif"));
		logo = new JLabel( new ImageIcon("assets/logo.png"));
		mapButton = new JButton( new ImageIcon("assets/mapButton.png"));
		exitButton = new JButton(new ImageIcon("assets/exitButton.png"));

		// Component attributes are set
		logo.setAlignmentX(CENTER_ALIGNMENT);
		mapButton.setAlignmentX(CENTER_ALIGNMENT);
		exitButton.setAlignmentX(CENTER_ALIGNMENT);
		
		mapButton.setBorderPainted(false);
		mapButton.setFocusPainted(false);
		mapButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setFocusPainted(false);
		exitButton.setContentAreaFilled(false);
		
		mapButton.setCursor( new Cursor( Cursor.HAND_CURSOR));
		exitButton.setCursor( new Cursor( Cursor.HAND_CURSOR));
		
		mapButton.addActionListener(getController());
		exitButton.addActionListener(getController());
	}

	// Organizes the layout of the components and the Launcher
	private void organizeComponents() {

		// background is the JLabel which holds the animated background and all
		// the components
		// BoxLayout allows components to be aligned and centered vertically,
		// as indicated by BoxLayout.Y_AXIS
		background.setLayout( new BoxLayout(background, BoxLayout.Y_AXIS));
		background.add(Box.createVerticalStrut(35)); // Creates vertical distance between components
		background.add(logo);
		background.add(Box.createVerticalStrut(65));
		background.add(mapButton);
		background.add(Box.createVerticalStrut(40));
		background.add(exitButton);

		this.add(background);
	}

	@Override
	public JButton getCommonButton(int commonButton) {

		if(commonButton == 0) // 0 indicates MAP_BUTTON
			return this.mapButton;
		else // 1 indicates EXIT_BUTTON
			return this.exitButton;
	}

	@Override
	public void setCommonButton(int commonButton, JButton buttonReplacer) {

		if(commonButton == 0) // 0 indicates MAP_BUTTON
			this.mapButton = buttonReplacer;
		else // 1 indicates EXIT_BUTTON
			this.exitButton = buttonReplacer;
	}

}
