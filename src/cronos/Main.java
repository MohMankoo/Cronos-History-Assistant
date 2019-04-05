/**
 * This class acts as the starting point of the Cronos application.
 * It controls how the program is run.
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	private static JFrame launcherFrame, applicationFrame, optionsFrame;
	private static Civilization[] appPages;

	/**
	 * The main method launches the application by displaying the start screen
	 * 
	 * @param args An array of String arguments
	 */
	public static void main(String[] args) {
		launchApp();
	}

	/**
	 * Builds the launcher
	 */
	private static void launchApp() {

		// The CronosPanel asked by the constructor is set to null because
		// the following constructor call to Launcher (subclass of CronosPanel)
		// sets the CronosPanel for the Controller as needed
		LauncherController launcherController = new LauncherController(null);
		Launcher mainMenu = new Launcher(launcherController);

		// Sets common attributes for launcherFrame
		launcherFrame = new JFrame("Cronos");
		launcherFrame.setSize(1150, 700);
		launcherFrame.setIconImage( new ImageIcon("assets/icon.png").getImage());
		launcherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		launcherFrame.setContentPane(mainMenu);
		launcherFrame.setLocationRelativeTo(null);
		launcherFrame.setResizable(false);
		launcherFrame.setVisible(true);
	}

	/**
	 * Builds the application and the core components. It is calle dby
	 * the LauncherController class
	 */
	public static void buildApp() {
		
		// Initializes the application pages/civilizations that will be displayed
		appPages = new Civilization[] {
				new Maya(null),
				new Inca(null),
				new Aztec(null),
				new Rome(null),
				new Greece(null),
				new Egypt(null),
				new Mesopotamia(null),
				new IndusValley(null),
				new Japan(null) };

		ApplicationController appController = new ApplicationController(null);
		Application app = new Application(appPages, appController);

		// Sets common attributes for applicationFrame
		applicationFrame = new JFrame("Cronos");
		applicationFrame.setSize(1150, 700);
		applicationFrame.setIconImage( new ImageIcon("assets/icon.png").getImage());
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.add(app.getToolbar(), BorderLayout.NORTH);
		applicationFrame.add(app);
		applicationFrame.setLocationRelativeTo(null);
		applicationFrame.setResizable(false);
		applicationFrame.setVisible(true);

		// Sets the launcher frame invisible
		launcherFrame.setVisible(false);
		
		// Builds the options menu so it can be used when it is called later
		Main.buildOptions();
	}

	/**
	 * Builds the options menu
	 */
	private static void buildOptions() {

		OptionsController optionsController = new OptionsController(null);
		Options optionsMenu = new Options(optionsController);
		
		// Sets common attributes for optionsFrame
		optionsFrame = new JFrame("Options");
		optionsFrame.setSize(450, 225);
		optionsFrame.setIconImage( new ImageIcon("assets/icon.png").getImage());
		optionsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		optionsFrame.setContentPane(optionsMenu);
		optionsFrame.setLocationRelativeTo(null);
		optionsFrame.setResizable(false);
	}

	/**
	 * Opens the options menu
	 */
	public static void openOptions() {
		optionsFrame.setVisible(true);
	}

	/**
	 * Closes the options menu
	 */
	public static void closeOptions() {
		optionsFrame.setVisible(false);
	}
	
	/**
	 * Returns the array containing the civilizations displayed in the application
	 * 
	 * @return A Civilization array containing all the civilizations displayed in the application
	 */
	public static Civilization[] getAppPages() {
		return appPages;
	}

}
