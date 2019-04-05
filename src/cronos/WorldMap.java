/**
 * This class represents the map from which the user can select the
 * civilization they want to study
 */

package cronos;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class WorldMap extends CronosPanel {

	private JButton map[];
	
	public static final int SOUTH_AMERICA = 2;
	public static final int MEDITERRANEAN = 5;
	public static final int MIDDLE_EAST = 8;
	public static final int EAST_ASIA = 11;

	public WorldMap(Controller controller) {
		super(controller);
	}

	@Override
	protected void buildComponents() {

		// There are 14 button components to the map
		map = new JButton[14];

		// Sets the map by dividing it into separate buttons
		for (int i = 0; i < map.length; i++) {
			map[i] = new JButton( new ImageIcon("assets/map/" + i + ".png"));
			map[i].setBorderPainted(false);
			map[i].setFocusPainted(false);
			map[i].setContentAreaFilled(false);
		}
		
		// Sets properties for the buttons which need be clickable
		// Pattern/Clickable Buttons: 2, 5, 8, 11
		for(int j = 2; j < 12; j+= 3) {
			map[j].addActionListener(getController());
			map[j].setCursor( new Cursor( Cursor.HAND_CURSOR));
		}

		// Sets layout properties 
		this.setLayout( new FlowLayout());
		this.setPreferredSize( new Dimension(1050, 584));
		
		// Removes gaps between components
		((FlowLayout) this.getLayout()).setHgap(-34); // Negative value needed to remove gaps
		
		// Organizes the map components/buttons
		this.add(map[0]);		
		this.add(generateColumn(1, 3)); // Add first column needing vertical alignment
		this.add(generateColumn(4, 6)); // Add second column
		this.add(generateColumn(7, 9)); // Add third column
		this.add(generateColumn(10, 12)); // Add final column
		this.add(map[13]);
	}

	/**
	 * 
	 * @param startPos The index number of the first component in a map column
	 * @param endPos The index number of the last component in a map column
	 * @return A vertical Box object containing a column of buttons
	 */
	private Box generateColumn(int startPos, int endPos) {
		
		Box column = Box.createVerticalBox();
		
		// There are 3 items/components/buttons per column
		for (int i = startPos; i < endPos + 1; i++) {
			column.add(map[i]);
			column.add(Box.createVerticalStrut(-10)); // Negative value needed to remove gaps
		}
		
		return column;
	}
	
	// ==============================
	//   Getter and Setter methods
	// ==============================
	
	@Override
	public JButton getCommonButton(int commonButton) {
		
		if(commonButton == 2) // 2 indicates SOUTH_AMERICA
			return this.map[2];
		else if(commonButton == 5) // 5 indicates MEDITERRANEAN
			return this.map[5];
		else if(commonButton == 8) // 8 indicates MIDDLE_EAST
			return this.map[8];
		else // 11 indicates EAST_ASIA
			return this.map[11];
	}

	@Override
	public void setCommonButton(int commonButton, JButton buttonReplacer) {
		
		if(commonButton == 2) // 2 indicates SOUTH_AMERICA
			this.map[2] = buttonReplacer;
		else if(commonButton == 5) // 5 indicates MEDITERRANEAN
			this.map[5] = buttonReplacer;
		else if(commonButton == 8) // 8 indicates MIDDLE_EAST
			this.map[8] = buttonReplacer;
		else // 11 indicates EAST_ASIA
			this.map[11] = buttonReplacer;
	}

}
