/**
 * Represents the Mesopotamia civilization
 * 
 * @author Mohpreet Mankoo
 * @author Amitoj Purewal
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Mesopotamia extends Civilization {

	public Mesopotamia(Controller controller) {
		super(controller, Civilization.MESOPOTAMIA);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[4];

		historicalInfo[0] = new JLabel("<html>" + "<h1> The Sumerians </h1>"

		+ "Considered the cradle of civilization as it was the first place where humans built permanent shelters and <br>"
				+ "created organized societies. <br>" + "<br>"

		+ "The Sumerians created a monarchial system to govern themselves with four social classes. They were also the<br>"
				+ "first humans known to have created a system of written language. This language developed into what is now <br>"
				+ "Cuneiform. They were also among the first users of the wheel. <br>" + "<br>"

		+ "The Sumerians tradely with neighboring areas which allowed their kingdom to flourish. <br>" + "<br>"

		+ "The Sumerians were once ruled by the famous king Gilgamesh from the city of Ur. Gilgamesh was the subject<br>"
				+ "of one of the oldest pieces of literature ever written by a later day Mesopotamian writer.<br>"
				+ "<br>"

		+ "</html>");

		historicalInfo[1] = new JLabel( "<html>" + "<h1> The Akkadians </h1>"

		+ "The Akkadian conquerer Sargon the Great conquered the Sumerians and created the world's first empire. He <br>"
				+ "unified Mesopotamia and created the capital at Akkad.<br>" + "<br>"

		+ "The Akkadians used the basic social structure created by the Sumerians for themselves. <br>" + "<br>"

		+ "During this period the empire expanded greatly beyond the old borders moving far to the west and the east.<br>"
				+ "<br>"

		+ "Eventually the Sumerian city Ur rose back to power and the empire was taken over by a Sumerian king who <br>"
				+ "continued to rule himself.<br>" + "<br>"

		+ "</html>");

		historicalInfo[2] = new JLabel( "<html>" + "<h1> The Babylonians </h1>"

		+ "Hammurabi becomes the ruler of Babylon and established the code of Hammurabi, an iconic body of laws. <br>"
				+ "<br>"

		+ "Hammurabi unifies Mesopotamia under the rule of Babylon. His code of laws is very strict with peasants and<br>"
				+ "favors the noble and rich. Some of the punishments for crimes are very severe.<br>" + "<br>"

		+ "During Babylonian rule the Assyrians are coming gaining power in the north. <br>" + "<br>"

		+ "</html>");

		historicalInfo[3] = new JLabel("<html>" + "<h1> The Assyrians </h1>"

		+ "In 1225 BCE the Assyrians conquered Babylon and gained control over the entire empire. They had a strong<br>"
				+ "totalitarian government that subjugated its citizens. <br>" + "<br>"

		+ "The Assyrians had an imperialistic mindset and a strong desire to expand their empire. <br>" + "<br>"

		+ "After a while the people revolted against their oppressors and overthrew the Assyrians.<br>" + "<br>"

		+ "Eventually Mesopotamia was taken over by Cyrus of Persia.<br>" + "<br>"

		+ "</html>");

	}

}
