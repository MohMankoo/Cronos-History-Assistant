/**
 * Represents the Indus Valley civilization
 * 
 * @author Mohpreet Mankoo
 * @author Inderbir Hair
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class IndusValley extends Civilization {

	public IndusValley(Controller controller) {
		super(controller, Civilization.INDUS_VALLEY);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[2];

		historicalInfo[0] = new JLabel( "<html>" + "<h1> Early Settlements </h1>"

		+ "Circa 3000 BCE early settlements are starting to emerge in the Indus Valley. People were starting to settle <br>"
				+ "around this area for thousands of years before now, but now they are building more permanent structures with<br>"
				+ "walled cities. They have also domesticated animals.<br>" + "<br>"

		+ "A few thousand years later the people develop a script for writing. The Indus Valley is among the few places in<br>"
				+ "the world where a written language was created independently, without external influences. Their script is <br>"
				+ "known as the Indus Script.<br>" + "<br>"

		+ "In Mohenjo-Daro and Harappa large cities have been built. The famed Great Bath was built at Mohenjo-Daro and was<br>"
				+ "likely used for ritualistic purposes. <br>" + "<br>"

		+ "Circa 1900 BCE the Indus Valley starts to decline. It is not known exactly why this happenend. It is believed <br>"
				+ "that it was either caused by a natural disaster or a result of an attack by the Aryans, a group of people from<br>"
				+ "the north.<br>" + "<br>"

		+ "</html>");

		historicalInfo[1] = new JLabel( "<html>" + "<h1> Development of Religion and Fall </h1>"

		+ "The Aryans brought with them many old religious beliefs and traditions. These beliefs became the basis of modern<br>"
				+ "day Hinduism. <br>" + "<br>"

		+ "Circa 1500 BCE the Vedas was composed. It is one of the most significant religous compositions for the people at<br>"
				+ "that time.<br>" + "<br>"

		+ "Circa 900 BCE the Mahabharata is composed. It is an epic poem, considered to be the longest in the world. It has<br>"
				+ "very strong religious significance for modern day Hindus.<br>" + "<br>"

		+ "Circa 563 BCE Siddhartha Gautama was born. A prince who came to be known as the Buddha. His teachings are the basis<br>"
				+ "Buddhism.<br>" + "<br>"

		+ "Late in the 6 century BCE the Indus Valley became a part of the expanding Persian Empire. <br>" + "<br>"

		+ "</html>");

	}

}
