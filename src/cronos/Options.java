/**
 * The Options class holds the core components of the options menu
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

@SuppressWarnings({ "rawtypes", "unchecked", "serial" })
public class Options extends CronosPanel {

	private JButton confirmOptions;
	
	private JComboBox fontType, fontStyle, fontSize;
	private String[] fontTypeOptions, fontStyleOptions, fontSizeOptions;

	public static final int CONFIRM_BUTTON = 0;
	public static final int FONT_TYPE_COMBO = 1;
	public static final int FONT_STYLE_COMBO = 2;
	public static final int FONT_SIZE_COMBO = 3;

	public Options(Controller controller) {
		super(controller);
	}

	@Override
	protected void buildComponents() {
		
		// Setup JComboBox lists of type String
		fontTypeOptions = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontStyleOptions = new String[] {"Plain", "Bold", "Italic"};
		fontSizeOptions = new String[50];

		// Setup font size options list
		for (int i = 0; i < fontSizeOptions.length; i++) {
			fontSizeOptions[i] = Integer.toString(i + 1);
		}

		// Setup the ComboBoxes
		// Statement 3: Find the index of default font Arial
		fontType = new JComboBox(fontTypeOptions);
		fontType.addActionListener(getController());
		fontType.setSelectedIndex( Arrays.binarySearch(fontTypeOptions, "Arial"));

		fontStyle = new JComboBox(fontStyleOptions);
		fontStyle.addActionListener(getController());
		fontStyle.setSelectedItem(0);

		fontSize = new JComboBox(fontSizeOptions);
		fontSize.addActionListener(getController());
		fontSize.setSelectedIndex(17); // Default size = 18; index of default size = 18 - 1

		// Setup OK button
		confirmOptions = new JButton("   Confirm   ");
		confirmOptions.setFont( new Font(null, Font.PLAIN, 18));
		confirmOptions.addActionListener(getController());

		// Panel settings and organization
		this.setLayout( new FlowLayout());
		this.setBorder( BorderFactory.createTitledBorder(
				null, "Program Options", TitledBorder.CENTER, TitledBorder.TOP,
				new Font(null, Font.BOLD, 25), Color.BLACK));

		// Craetes individual columns for each ComboBox
		Box fontTypeColumn = Box.createVerticalBox();
		fontTypeColumn.add( new JLabel("Select font"));
		fontTypeColumn.add(fontType);

		Box fontStyleColumn = Box.createVerticalBox();
		fontStyleColumn.add( new JLabel("Select style"));
		fontStyleColumn.add(fontStyle);

		Box fontSizeColumn = Box.createVerticalBox();
		fontSizeColumn.add( new JLabel("Select size"));
		fontSizeColumn.add(fontSize);

		// Holds all the ComboBoxes and associated labels
		Box comboHolder = Box.createHorizontalBox();
		comboHolder.add(fontTypeColumn);
		comboHolder.add(fontStyleColumn);
		comboHolder.add(fontSizeColumn);

		this.add(Box.createVerticalStrut(100));
		this.add(comboHolder);
		this.add(Box.createVerticalStrut(15));
		this.add(confirmOptions);
		this.add(Box.createVerticalStrut(20));
	}

	// ==============================
	//   Getter and Setter methods
	// ==============================

	@Override
	public JButton getCommonButton(int commonButton) {

		if (commonButton == Options.CONFIRM_BUTTON) // 0
			return this.confirmOptions;
		else
			return null;
	}

	@Override
	public void setCommonButton(int commonButton, JButton buttonReplacer) {

		if (commonButton == Options.CONFIRM_BUTTON) // 0
			this.confirmOptions = buttonReplacer;
	}

	public JComboBox getCommonComboBox(int commonCombo) {
		
		if (commonCombo == Options.FONT_TYPE_COMBO) // 1
			return this.fontType;
		else if (commonCombo == Options.FONT_STYLE_COMBO) // 2
			return this.fontStyle;
		else // 3
			return this.fontSize;
	}

	public void setCommonComboBox(int commonCombo, JComboBox combo) {
		
		if (commonCombo == Options.FONT_TYPE_COMBO) // 1
			this.fontType = combo;
		else if (commonCombo == Options.FONT_STYLE_COMBO) // 2
			this.fontStyle = combo;
		else // 3
			this.fontSize = combo;
	}

}
