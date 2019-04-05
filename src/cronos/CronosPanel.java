/**
 * An abstract class which holds the functionality needed by its
 * Panel subclasses (such as the Egypt class)
 * 
 * @author Mohpreet Mankoo
 * @since 1.0
 */

package cronos;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class CronosPanel extends JPanel {
	
	private Controller controller;
	
	/**
	 * The constructor
	 * 
	 * @param controller A controller object that controls the buttons in this class
	 */
	public CronosPanel(Controller controller) {
		
		// CronosFrame sets the controller passed to the method for itself and then
		// calls said controller object to set itself as the frame the controller will work on
		this.setController(controller);
		
		if (controller != null) {
			controller.setAssociatedPanel(this);
			
			if (this instanceof Application)
				controller.setAssociatedApp((Application) this);
		}
		
		this.buildComponents();
	}
	
	/**
	 * 
	 */
	protected abstract void buildComponents();
	
	// ==============================
	//   Getter and Setter methods
	// ==============================
	
	/**
	 * This method is intended only for the use of polymorphism.
	 * It will allow classes which create an instance of this class
	 * to get the Buttons held by this class' subclasses.
	 * 
	 * @param commonButton  An <code>int</code>, represented by class constants,
	 * indicating which Button is needed
	 * @return 			   The button required as indicated by the argument
	 */
	public abstract JButton getCommonButton(int commonButton);
	
	/**
	 * This method is intended only for the use of polymorphism,
	 * hence the reason it does not contain any code. 
	 * It will allow classes which create an instance of this class
	 * to get the Buttons held by this class' subclasses.
	 * 
	 * @param commonButton   An <code>int</code>, represented by class constants,
	 * indicating which Button is needed
	 * @param buttonReplacer The button that will replace the button
	 * as denoted by the <code>int commonButton</code>
	 */
	public abstract void setCommonButton(int commonButton, JButton buttonReplacer);
	
	/**
	 * Sets the <code>Controller</code> object for this class
	 * 
	 * @return The <code>Controller</code> being used by this class
	 */
	public Controller getController() {
		return controller;
	}
	
	/**
	 * Returns the controller for this class
	 * 
	 * @param controller The <code>Controller</code> being used by this class
	 */
	public void setController(Controller controller) {
		this.controller = controller;
	}

}
