/**
 * Controls how the components in the Application class function
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

import javax.swing.JOptionPane;

public class ApplicationController extends Controller implements ActionListener {

	private Desktop userComputer;
	
	public ApplicationController(Application associatedApp) {
		super(associatedApp);
		userComputer = Desktop.getDesktop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == associatedPanel.getCommonButton(Application.HOME_BUTTON)) {	
			associatedApp.showPage(Application.MAP_PAGE);
			associatedApp.configureTabs(Application.CONFIG_HOME);
		
		} else if (e.getSource() == associatedPanel.getCommonButton(Application.WIKI_BUTTON)) {
			if (associatedApp.getConfigState() == WorldMap.SOUTH_AMERICA)
				browseWiki("https://en.wikipedia.org/wiki/History_of_South_America");
			else if (associatedApp.getConfigState() == WorldMap.MEDITERRANEAN)
				browseWiki("https://en.wikipedia.org/wiki/History_of_the_Mediterranean_region");
			else if (associatedApp.getConfigState() == WorldMap.MIDDLE_EAST)
				browseWiki("https://en.wikipedia.org/wiki/History_of_the_Middle_East");
			else if (associatedApp.getConfigState() == WorldMap.EAST_ASIA)
				browseWiki("https://en.wikipedia.org/wiki/History_of_East_Asia");
			else
				JOptionPane.showMessageDialog(null, "This page does not have have a wikipedia article associated with it",
						"                                                                     " + "Alert",
						JOptionPane.WARNING_MESSAGE);

			
		} else if (e.getSource() == associatedPanel.getCommonButton(Application.OPTIONS_BUTTON)) {	
			Main.openOptions();
			
		} else if (e.getSource() == associatedPanel.getCommonButton(Application.TAB1)) {	
			if (associatedApp.getConfigState() == WorldMap.SOUTH_AMERICA)
				associatedApp.showPage(Civilization.MAYA);
			else if (associatedApp.getConfigState() == WorldMap.MEDITERRANEAN)
				associatedApp.showPage(Civilization.EGYPT);
			else if (associatedApp.getConfigState() == WorldMap.MIDDLE_EAST)
				associatedApp.showPage(Civilization.MESOPOTAMIA);
			else if (associatedApp.getConfigState() == WorldMap.EAST_ASIA)
				associatedApp.showPage(Civilization.JAPAN);
			else // Home
				associatedApp.showPage(Application.MAP_PAGE);
			
		} else if (e.getSource() == associatedPanel.getCommonButton(Application.TAB2)) {	
			if (associatedApp.getConfigState() == WorldMap.SOUTH_AMERICA)
				associatedApp.showPage(Civilization.INCA);
			else if (associatedApp.getConfigState() == WorldMap.MEDITERRANEAN)
				associatedApp.showPage(Civilization.GREECE);
			else // Middle East
				associatedApp.showPage(Civilization.INDUS_VALLEY);
			
		} else if (e.getSource() == associatedPanel.getCommonButton(Application.TAB3)) {	
			if (associatedApp.getConfigState() == WorldMap.SOUTH_AMERICA)
				associatedApp.showPage(Civilization.AZTEC);
			else if (associatedApp.getConfigState() == WorldMap.MEDITERRANEAN)// Mediterranean
				associatedApp.showPage(Civilization.ROME);
		} 	
	}
	
	private void browseWiki(String URL) {
		try {
			userComputer.browse( URI.create(URL));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Invalid URL",
					"Error", JOptionPane.ERROR);
		}
	}

}
