/**
 * Represents the civilization of Japan
 * 
 * @author Mohpreet Mankoo
 * @author Inderbir Hair
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Japan extends Civilization {

	public Japan(Controller controller) {
		super(controller, Civilization.JAPAN);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[6];
		
		historicalInfo[0] = new JLabel(
				"<html>"
				+ "<h1> Jomon Period in Japan </h1>"
				+ "Stone age hunters and gatherers settle in Japan. Archaeologists have discovered rope pattern<br>"
				+ "(jomon) pottery from this period.<br>" 
				+ "</html>");

		historicalInfo[1] = new JLabel(
				"<html>"
				+ "<h1> Yayoi Period in Japan</h1>"
				+ "Rice cultivation, metalworking, and pottery wheel are introduced to japan. Name the Yayoi <br>"
				+ "period after the location where the pottery wheel was found. In Shinto, spiritual beliefs start <br>"
				+ "to emerge as people identify kami in nature, and human virtues. Local clans form early <br>"
				+ "political parties.<br>"
				+ "</html>");

		historicalInfo[2] = new JLabel(
				"<html>"
				+ "<h1>Kofun Period in Japan </h1>"
				+ "Powerful rulers unified Japan. Japan establishes close contacts with mainland Asia <br>"
				+ "Descendants of Amaterasu Omikami begin imperial dynasty that continues to occupy the <br>"
				+ "throne today. Japan adopts Chinese written characters. Shotoku Taishi (574-622) begins <br>"
				+ "shaping Japan to fit the example of society and government set by China, seeking <br>"
				+ "centralization of government and a bureaucracy of merit. He says that teaching of both <br>"
				+ "Buddhism and Confucian must be respected. <br>"
				+ "</html>");

		historicalInfo[3] = new JLabel(
				"<html>" 
				+ "<h1>Asuka Period in Japan </h1>"
				+ "Taika No Kaishin aims to strengthen the power of the emperor. New aristocratic families <br>"
				+ "form. Fujiwara no Kamatari helps push reform.<br>"
				+ "</html>");

		historicalInfo[4] = new JLabel(
				"<html>" 
				+ "<h1> Nara Period in Japan </h1>"
				+ "Imperial court builds new capital, modeled upon Chang-an. Emperors are Shinto chiefs, though, <br>"
				+ "they patronize Buddhism belief about a peaceful society and how it will protect the state. <br>"
				+ "Legends surrounding the founding of Japan are compiled as history in the Kojiki and the Nihon. <br>"
				+ "With the adoption of Buddhism as the state religion, its monasteries gain political power.  <br>"
				+ "</html>");
		
		historicalInfo[5] = new JLabel(
				"<html>" 
				+ "<h1> Heian Period in Japan </h1>"
				+ "Imperial court moves to Kyoto to escape domination of Nara's Buddhist establishment. Official <br>"
				+ "contacts with China stop in 838. Classical Japanese culture thrives, aided by the invention of <br>"
				+ "kana syllabary for writing Japanese language. Court women produce what is considered to be <br>"
				+ "the greatest of era's literature. The world's first novel, Tale of Genji, is written by Murasaki Shikibu <br>"
				+ "in 1002. Warrior class begins to gain power, causing decline in power of the court. <br>"
				+ "</html>");
	}

}
