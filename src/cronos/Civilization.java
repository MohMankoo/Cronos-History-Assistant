/**
 * An abstract class which holds the functionality needed by its
 * Civilization subclasses (such as the Egypt class)
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public abstract class Civilization extends CronosPanel {
	
	// Used by sorting algorithm to arrange a Civilization[] array in an order 
	// that is consistent in all arrays
	private final int CIV_IDENTITY;
	
	// Public values that can be used to refer to certain Civilizations by other classes
	public static final int EGYPT = 0;
	public static final int GREECE = 1;
	public static final int INDUS_VALLEY = 2;
	public static final int MESOPOTAMIA = 3;
	public static final int ROME = 4;
	public static final int AZTEC = 5;
	public static final int JAPAN = 6;
	public static final int INCA = 7;
	public static final int MAYA = 8;

	protected JLabel[] historicalInfo;
	protected static Font infoFont;
	
	// Sets the default font
	static {
		infoFont = new Font("Arial", Font.PLAIN, 18);
	}
	
	/**
	 * The constructor
	 * 
	 * @param controller A controller object that controls the buttons in the <code>Launcher</code>
	 * @param civIdentity An int representing which Civilization is being created. For instance,
	 * Civilization.EGYPT or Civilization.ROME
	 */
	public Civilization(Controller controller, int civIdentity) {
		super(controller);
		this.CIV_IDENTITY = civIdentity;
	}
	
	// Called by the superclass constructor
	@Override
	protected void buildComponents() {
		
		this.buildHistoricalInfo(); // Build the appropriate JLabels, etc
		this.registeInfoFonts(); // Sets the default font info
		this.addHistoricalInfo(); // Add the created JLabels or other components to their respective panels
	}
	
	protected abstract void buildHistoricalInfo();
	
	private void addHistoricalInfo() {
		
		// Sets all info to be displayed top to bottom
		Box infoHolder = Box.createVerticalBox();
		
		// Adds all the info to infoHolder
		for (int i = 0; i < historicalInfo.length; i++)
			infoHolder.add(historicalInfo[i]);
		
		// Sets all Civilization panels to layout info left to right
		this.setLayout( new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(Box.createHorizontalStrut(100));
		this.add(infoHolder);
	}
	
	public void registeInfoFonts() {
		for (int i = 0; i < historicalInfo.length; i++)
			historicalInfo[i].setFont(infoFont);
	}
	
	// Uses bubble sort
	@SuppressWarnings("unused")
	public static Civilization[] sortCivArray(Civilization[] civArray) {
		
		// A temporary variable used in the sort
		Civilization temp;
		
		// Uses bubble sort
		for (int i = civArray.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (civArray[j].getCivIdentity() > civArray[j + 1].getCivIdentity()) {
					
					temp = civArray[j];
					civArray[j] = civArray[j + 1];
					civArray[j + 1] = civArray[j];
				}
		
		return civArray;
	}
	
	/**
	 * Generates a JScrollPane containing the Civilization object passed through the
	 * parameters
	 * 
	 * @param civ The Civilization object to add to the JScrollPane
	 * @return A JScrollPane containing the Civilization object passed through the
	 * parameters
	 */
	public static JScrollPane generateInfoScroller(Civilization civ) {
		
		JScrollPane scroller = new JScrollPane(civ, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroller.getVerticalScrollBar().setUnitIncrement(20);
		
		return scroller;
	}
	
	// ==============================
	//   Getter and Setter methods
	// ==============================
	
	public int getCivIdentity() {
		return CIV_IDENTITY;
	}

	public JLabel[] getHistoricalInfo() {
		return historicalInfo;
	}

	public void setHistoricalInfo(JLabel[] historicalInfo) {
		this.historicalInfo = historicalInfo;
	}

	public static Font getInfoFont() {
		return infoFont;
	}

	public static void setInfoFont(Font infoFont) {
		Civilization.infoFont = infoFont;
	}
	
	// ================================================================
	//   Implemented so subclasses do not need to implement them
	// ================================================================
	
	@Override
	public JButton getCommonButton(int commonButton) {
		return null;
	}

	@Override
	public void setCommonButton(int commonButton, JButton buttonReplacer) {}
	
}
