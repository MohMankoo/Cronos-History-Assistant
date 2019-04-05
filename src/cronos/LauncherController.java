/**
 * Controls how the components in the Launcher class function
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LauncherController extends Controller implements ActionListener {

	public LauncherController(Launcher associatedPanel) {
		super(associatedPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == getAssociatedPanel().getCommonButton(Launcher.MAP_BUTTON))
			Main.buildApp();
		else if (e.getSource() == getAssociatedPanel().getCommonButton(Launcher.EXIT_BUTTON))
			System.exit(0);
	}

}
