/**
 * Represents the Rome civilization
 * 
 * @author Mohpreet Mankoo
 * @author Amitoj Purewal
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Rome extends Civilization {

	public Rome(Controller controller) {
		super(controller, Civilization.ROME);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[3];

		historicalInfo[0] = new JLabel( "<html>" + "<h1> Early Rome/Rome as a Monarchy </h1>"

		+ "753 BCE is the date of the mythological founding of Rome, but historians don't have any firm date of the<br>"
				+ "actual founding as there are no written records.<br>" + "<br>"

		+ "The myth of the founding states that the city was founded by Romulus, a descendent of the Trojan prince<br>"
				+ "Aeneus. Romulus also had the blood of the gods Mars and Venus in him. <br>" + "<br>"

		+ "Rome was conquered by a group of people known as Etruscans in Circa 600 BCE. <br>" + "<br>"

		+ "For it's early years, Rome was a traditional monarchy ruled by Etruscan kings. This monarchy was ousted <br>"
				+ "along with all the Etruscans by a rebellion that was caused by the outrage that king's son Sextus caused <br>"
				+ "when heraped a noble woman by the name of Lucretia. However there is no hard evidence to support this story,<br>"
				+ "and some consider it merely a myth.<br>" + "<br>"

		+ "</html>");

		historicalInfo[1] = new JLabel( "<html>" + "<h1> The Roman Republic </h1>"

		+ "After the Etruscans were ousted, the Roman people decided to make a form of government that would allow<br>"
				+ "the people to rule themselves. Thus, the Republic of Rome came into being, a complex system where the <br>"
				+ "land was ruled by a Senate and involved many different branches so that no one person could get too much<br>"
				+ "power.<br>" + "<br>"

		+ "It was during this period that the Punic Wars occured. These were wars in which Rome fought against the<br>"
				+ "North African city of Carthage. For the most part, Carthage was led by the famous general Hannibal. In the<br>"
				+ "end, Rome defeated the Carthaginians and destroyed the city, lining the fields with salt to prevent a <br>"
				+ "community from ever rising there again.<br>" + "<br>"

		+ "As time passed it became evident that the Senate favoured patricians, the rich, over plebians, the<br>"
				+ "poor. The Senate was more focused on maintaing their own power and wealth than they were on the working for<br>"
				+ "the people. <br>" + "<br>"

		+ "Late into the Roman Republic, generals were gaining more power, civil wars were breaking out, and the <br>"
				+ "government refused to reform. All these factors contributed to the fall of the Roman Republic.<br>"
				+ "<br>"

		+ "In one of these civil wars, a Roman man by the name of Julius Caesar defeated his rivals and became the<br>"
				+ "supreme leader of Rome. Though the Senate was still around, it was recognized by the people that Caesar<br>"
				+ "held all the power. The Senate attempts to bring back a true republic by assassinating Caesar, a revolt<br>"
				+ "led by the senator Brutus, but instead war breaks out again.<br>" + "<br>"

		+ "The war ends with Caesar's nephew, Augustus coming to power, and now becoming supreme ruler. This was the<br>"
				+ "official start of the Roman Empire.<br>" + "<br>"

		+ "</html>");

		historicalInfo[2] = new JLabel( "<html>" + "<h1> The Roman Empire </h1>"

		+ "After Augustus died, many different emperors ruled Rome. Many grew mad with power and abused their positions.<br>"
				+ "Thus, this period was very unstable politically.<br>" + "<br>"

		+ "A short while after the inception of the Empire, the common era started. <br>" + "<br>"

		+ "In 80 CE the Colosseum was built.<br>" + "<br>"

		+ "As Christianity was gaining ground around Europe, Romans persecuted Christians, as they still believed in <br>"
				+ "the old gods. This changed however when Constantine became emperor, as he converted to Christianity.<br>"
				+ "<br>"

		+ "The emperor Theodosius I declared that Christianity would be the religion of the state. <br>" + "<br>"

		+ "In 395 CE Rome split into two empires, with the western side being taken over by Germanic tribes. In 476 CE <br>"
				+ "the last emperor Romulus Augustus was defeated and this brought about the start of the Dark Ages in Europe. <br>"
				+ "<br>"

		+ "</html>");

	}

}
