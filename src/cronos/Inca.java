/**
 * Represents the Inca civilization
 * 
 * @author Mohpreet Mankoo
 * @author Inderbir Hair
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Inca extends Civilization {

	public Inca(Controller controller) {
		super(controller, Civilization.INCA);
	}

	@Override
	protected void buildHistoricalInfo() {
		
		historicalInfo = new JLabel[3];
		
		historicalInfo[0] = new JLabel(
				"<html>" 
				+ "<h1> Early Period in Inca </h1>"
				+ "The Inca first settle in the Cuzco Valley (now the country of Peru) in 1200. They gain control of the<br>"
				+ "Pacific Coast between Columbia and northern Chile. Manco Capac is considered the first Inca. Believed <br>"
				+ "to be the son of the sun, he marries his sister, Mama Ocllo, the daughter of the moon. This creates the <br>"
				+ "tradition that the Inca ruler must marry his sister, and it is only from this marriage that the next ruler can be named <br>"
				+ "</html>");

		historicalInfo[1] = new JLabel(
				"<html>" 
				+ "<h1> Middle Period in Inca </h1>"
				+ "The Inca develop a record-keeping system using strings with various knots. They make over 15,000 miles <br>"
				+ "of road with a relay system set up so messages can be sent quickly to the Sapa Inca. They set up <br>"
				+ "storehouses, and they teach each conquered area the way of the Inca. <br>" + "</html>");

		historicalInfo[2] = new JLabel(
				"<html>"
				+ "<h1> Late Period in Inca </h1>"
				+ "The Inca capture the Chanca, led by their 9th ruler, Pachacuti. <br>"
				+ "The Empire is split up into four sections, ruled by the council of 4 apus, and sub-sectioned into <br>"
				+ "provinces, ruled by appointed governors. Pachacuti conquers more lands and some coastal areas by 1470. <br>"
				+ "The empire expands as people decide to follow the Inca rather than fight them. Pachacuti dies in 1471. <br>"
				+ "</html>");

	}

}
