/**
 * Controls how the components in the Options class function
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.Font;
import java.awt.event.ActionEvent;

public class OptionsController extends Controller {
	
	private String fontTypeOption, fontSizeOption;
	private int fontStyleOption;
	
	public OptionsController(Options associatedPanel) {
		super(associatedPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ( e.getSource() == associatedPanel.getCommonButton(Options.CONFIRM_BUTTON)) {
			
			Main.closeOptions();
			Civilization.setInfoFont( new Font( fontTypeOption, fontStyleOption, Integer.parseInt(fontSizeOption)));
			updateInfoFonts(Main.getAppPages());
			
		} else if ( e.getSource() == ((Options) associatedPanel).getCommonComboBox(Options.FONT_TYPE_COMBO))
			fontTypeOption = (String) ((Options) associatedPanel).getCommonComboBox(Options.FONT_TYPE_COMBO).getSelectedItem();
			
		else if ( e.getSource() == ((Options) associatedPanel).getCommonComboBox(Options.FONT_STYLE_COMBO))
			fontStyleOption = ((Options) associatedPanel).getCommonComboBox(Options.FONT_STYLE_COMBO).getSelectedIndex();
			
		else if ( e.getSource() == ((Options) associatedPanel).getCommonComboBox(Options.FONT_SIZE_COMBO))
			fontSizeOption = (String) ((Options) associatedPanel).getCommonComboBox(Options.FONT_SIZE_COMBO).getSelectedItem();
	}
	
	private void updateInfoFonts(Civilization[] appPages) {
		for (int i = 0; i < appPages.length; i++)
			appPages[i].registeInfoFonts();
	}

}
