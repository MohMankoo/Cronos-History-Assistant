/**
 * Controls how the components in the WorldMap class function
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldMapController extends Controller implements ActionListener {
	
	public WorldMapController(WorldMap associatedPanel, Application associatedApp) {
		super(associatedPanel, associatedApp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == associatedPanel.getCommonButton(WorldMap.SOUTH_AMERICA)) {
			associatedApp.configureTabs(Application.CONFIG_SOUTH_AMERICA);
			associatedApp.showPage(Civilization.MAYA);
			
		} else if (e.getSource() == associatedPanel.getCommonButton(WorldMap.MEDITERRANEAN)) {
			associatedApp.configureTabs(Application.CONFIG_MEDITERRANEAN);
			associatedApp.showPage(Civilization.EGYPT);
			
		} else if (e.getSource() == associatedPanel.getCommonButton(WorldMap.MIDDLE_EAST)) {
			associatedApp.configureTabs(Application.CONFIG_MIDDLE_EAST);
			associatedApp.showPage(Civilization.MESOPOTAMIA);
			
		} else if (e.getSource() == associatedPanel.getCommonButton(WorldMap.EAST_ASIA)) {
			associatedApp.configureTabs(Application.CONFIG_EAST_ASIA);
			associatedApp.showPage(Civilization.JAPAN);
		}
	} 

}
