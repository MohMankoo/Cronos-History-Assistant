/**
 * An abstract class which holds the methods and fields needed by
 * Controller subclasses. This class is set to abstract because it offers
 * no functionality on its own upon instantiation.
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import java.awt.event.ActionListener;

public abstract class Controller implements ActionListener {

	protected Application associatedApp;
	protected CronosPanel associatedPanel;
	
	/**
	 * The constructor
	 * 
	 * @param associatedPanel The CronosPanel associated with this controller
	 * @param associatedApp The Application in which this Controller resides. It can be
	 * set to <code>null</code> if there is no need for the Controller to associate itself
	 * with the Application in which it belongs
	 */
	public Controller(CronosPanel associatedPanel, Application associatedApp) {
		setAssociatedPanel(associatedPanel);
		setAssociatedApp(associatedApp);
	}

	/**
	 * The contructor
	 * 
	 * @param associatedPanel The CronosPanel associated with this controller
	 */
	public Controller(CronosPanel associatedPanel) {
		this(associatedPanel, null);
	}

	/**
	 * The contructor
	 * 
	 * @param associatedApp The Application in which this Controller resides. It can be
	 * set to <code>null</code> if there is no need for the Controller to associate itself
	 * with the Application in which it belongs
	 */
	public Controller(Application associatedApp) {
		this(associatedApp, associatedApp);
	}

	/**
	 * Gets the CronosPanel associated with this controller
	 * 
	 * @return The CronosPanel associated with this controller
	 */
	public CronosPanel getAssociatedPanel() {
		return this.associatedPanel;
	}

	/**
	 * Sets the CronosPanel associated with this controller
	 * 
	 * @param panel The CronosPanel associated with this controller
	 */
	public void setAssociatedPanel(CronosPanel panel) {
		this.associatedPanel = panel;
	}

	/**
	 * Gets the Application in which this Controller resides
	 * 
	 * @return The Application in which this Controller resides
	 */
	public Application getAssociatedApp() {
		return this.associatedApp;
	}

	/**
	 * Sets the Application in which this Controller resides
	 * 
	 * @param app The Application in which this Controller resides
	 */
	public void setAssociatedApp(Application app) {
		this.associatedApp = app;
	}

}
