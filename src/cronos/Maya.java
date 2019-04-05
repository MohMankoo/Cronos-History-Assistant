/**
 * Represents the Maya civilization
 * 
 * @author Mohpreet Mankoo
 * @author Inderbir Hair
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Maya extends Civilization {

	public Maya(Controller controller) {
		super(controller, Civilization.MAYA);
	}

	@Override
	protected void buildHistoricalInfo() {
		
		historicalInfo = new JLabel[7];
		
		historicalInfo[0] = new JLabel(
				"<html>"
				+ "<h1> Paleolithic Period in Maya </h1>"
				+ "Early hunter-gatherer settlers gather in the Maya highlands and lowlands.<br>"
				+ "</html>");

		historicalInfo[1] = new JLabel // Circa 3114 - 2000 BCE
		("<html>" + "<h1> Early Maya Period </h1>"
				+ "Mayan calendar states that the world was created in 3114 BCE.2000 BCE the <br>"
				+ "Mayan civilization begins. Farming become more prominent throughout Maya <br>" + " regions.<br>"
				+ "</html>");

		historicalInfo[2] = new JLabel(
				"<html>"
				+ "<h1> Middle Preclassic Maya </h1>"
				+ "In 700 BCE Hieroglyphics were developed in Mesoamerica, this is considered to be the <br>"
				+ "most complicated thing to come out of Mesoamerica. By 400 BCE the earliest known solar <br>"
				+ "known solar calendars carved in stone are in use among the Maya. In 300 BCE Maya <br>"
				+ "adopt the idea of a hierarchical society and municipality government. <br>"
				+ "</html>");

		historicalInfo[3] = new JLabel(
				"<html>"
				+ "<h1> Late Preclassic Maya </h1>"
				+ "The city of Teotihuacan is founded and becomes the cultural, religious and trading centre of <br>"
				+ "Mesoamerica for centuries. The city of Cerros is built, with several of temples and ball courts. <br>"
				+ "Cerros is abandoned a century after being built, with its previous occupants returning to <br>"
				+ "fishing and farming . There is a decline in the olmec civilization."
				+ "</html>");

		historicalInfo[4] = new JLabel(
				"<html>"
				+ "<h1> Early Classic Maya </h1>"
				+ "The Maya highlands fall under the domination of Teotihuacan in 400 CE. The disintegration of Maya <br>"
				+ "culture and language begins in some parts of the highlands. Circa 500 CE, the Maya city of Tikal becomes <br>"
				+ "the first great Mayan city, as citizens from Teotihuacan make their way to Tikal, introducing new ideas <br>"
				+ "involving weaponry, captives, ritual practices and human sacrifice. The civilization at Teotihuacan was destroyed in <br>"
				+ "The civilization at Teotihuacan was destroyed in 600 CE, along with the empire it supported. Tikal becomes the <br>"
				+ "largest city-state in Mesoamerica, with as many as 500,000 inhabitants within the city and its hinterland. <br>"
				+ "</html>");

		historicalInfo[5] = new JLabel(
				"<html>" 
				+ "<h1> Late Classic Maya </h1>"
				+ "The Emperor Pacal dies at the age of 80 in 683 CE, He is buried in the Temple of the Inscriptions at <br>"
				+ "Palenque. Long-standing Maya alliances begin to break down in 751 CE. Trade between Maya city-states declines, <br>"
				+ "and inter-state conflict increases. Construction ceases in Tikal in 869 CE, marking the beginning <br>"
				+ "of the city's decline. Tikal is abandoned 899 CE. The Classic Period of Maya history ends, with the collapse<br>"
				+ "of the southern lowland cities. Maya cities in the northern Yucatán continue to thrive. <br>"
				+ "</html>");

		historicalInfo[6] = new JLabel(
				"<html>"
				+ "<h1> Post Classic Maya </h1>"
				+ "Northern Mayan cities begin to be abandoned. The city of Chichén Itzá is abandoned by the Toltecs in <br>"
				+ "1224 CE. A people known as the Uicil-abnal, which later takes the name Itzá, settles in the desolate city. <br>"
				+ "The Itzá abandon Chichén Itzá in 1244 CE. 1263 CE marks the beginning of construction of Mayapán, <br>"
				+ "by the Itzá. Mayapán becomes the capital of Yucatán in 1283 CE. There is a rebellion within Mayapán and <br>"
				+ "the city is abandoned by 1461. Shortly after this, Yucatán degenerates from a single united kingdom into <br>"
				+ "sixteen rival statelets, each anxious to become the most powerful. <br>"
				+ "</html>");
	}

}
