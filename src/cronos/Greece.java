/**
 * Represents the Greece civilization
 * 
 * @author Mohpreet Mankoo
 * @author Amitoj Purewal
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Greece extends Civilization {

	public Greece(Controller controller) {
		super(controller, Civilization.GREECE);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[3];

		historicalInfo[0] = new JLabel("<html>" + "<h1> Early Greece/The Heroic Age </h1>"

		+ "Minoan civilization starts to thrive in Crete, an island in the Mediterranean sea. The Minoans develop<br>"
				+ "a form of writing now known as <br>" + "<br>"

		+ "The Mycenaean is civilization thriving on the Greek mainland. They are the first to speak Greek. " + "<br>"

		+ "The Minoan civilization eventually collapsed, though it is not known why. Theories among historians <br>"
				+ "suggest either a natural catastrophe such as a volcanic eruption or an earthquake, or perhaps a war <br>"
				+ "between the Minoans and the Mycenaeans.<br>" + "<br>"

		+ "The Greeks who lived later on in the Classical period believed it was during this period, the Heroic Age,<br>"
				+ "that demi-gods and heroes like Achilles and Heracles had lived. It was also during this time the great <br>"
				+ "Greek poet Homer penned his famous epic poems, the 'Iliad' and the 'Odyssey'.<br>" + "<br>"

		+ "</html>");

		historicalInfo[1] = new JLabel( "<html>" + "<h1> The Classical Age </h1>"

		+ "The first Olympic Games are held at the Greek city of Olympia. They were part of a five day festival for<br>"
				+ "Zeus, the king of the gods in Greek mythology. Thousands of animals were slaughtered in his honour. <br>"
				+ "<br>"

		+ "Around the 7 century BCE democracy is starting to be used in place of tyrants and monarchs in many city-states<br>"
				+ "on the Greece mainland, most notably, in Athens.<br>" + "<br>"

		+ "In 546 BCE the Persian empire managed to subjugate some of Greece's territory in Asia Sinor, and took it under<br>"
				+ "their control.<br>" + "<br>"

		+ "Between 499 - 495 BCE Greeks under Persian control revolted against their opressors in a famous uprising known as<br>"
				+ "the Ionian Revolt. However, their were stopped by the Persians with many of the people being enslaved. The city<br>"
				+ "of Miletus, who had led the revolt, is destroyd. <br>" + "<br>"

		+ "The brutality of the defeat of the uprising is very upsetting and frightening to Greeks on the mainland. The Persian<br>"
				+ "king, Darius, was also effected by the revolt, and in his anger decides to attack the Greek mainland.<br>"
				+ "<br>"

		+ "In 490 BCE Darius travels to Greece with an enormous army and demands land and resources to sate his anger. The <br>"
				+ "Athenians refuse and battle angainst the Persians in what is known as the Battle of Marathon, part of the First<br>"
				+ "Persian War. Though the Athenians are outnumbered 2 to 1, and have been refused assistance from the Greek city-state<br>"
				+ "of Sparta, they manage to defeat the Persians in a stunning fashion, bringing Glory to their city and to Greece.<br>"
				+ "<br>"

		+ "Darius' son Xerxes returned to Greece in 480 to exact revenge, bringing with them an even larger army. This campaign<br>"
				+ "starts the Second Persian War. This time the Spartans agree to help the Athenians. The Spartan king Leonidas famously<br>"
				+ "attempted to hold the pass at Thermopylae with only 4000 soldiers and 300 bodyguards. They fought exceptionally well<br>"
				+ "but were betrayed by a shepard, and most died. With the pass now clear, the Persians marched foward to Athens.<br>"
				+ "<br>"

		+ "The Athenians, aware of the Persian army's imminent arrival, abandon the city, and their navy readies 300 triremes<br>"
				+ "(swift Greek ships) at Salamis, near Athens, and enticed the Persian fleet into the water. Despite being, once again,<br>"
				+ "heavily outnumbered, the Athenian navy dominated the battle, and defeated the Persians decisively. Xerxes flees back<br>"
				+ "to Persia to save himself. <br>" + "<br>"

		+ "The Classical Age concluded with the Peloponnesian War, the most brutal war the Greeks fought. The main conflict<br>"
				+ "was between the Spartans and their Peloponnesian League, and the Athenians and their Delian League. It concluded<br>"
				+ "with the defeat and fall of both Sparta and Athens, with the city-state of Macedonia now controlling Greece.<br>"
				+ "<br>"

		+ "</html>");

		historicalInfo[2] = new JLabel("<html>" + "<h1> The Hellenistic Age </h1>"

		+ "This age in Greek history was marked with Greek's rapid expansion across Asia and in parts of Africa. The <br>"
				+ "Macedonian leader, Philip II took over Greece with his technological superiority in weapons, and the Macedonians<br>"
				+ "then continued to expand outside Greece's borders. <br>" + "<br>"

		+ "Philip wished to expand his empire into Persia but was assassinated before he could begin his plan, and the <br>"
				+ "expansion was left to his son Alexander, better known as Alexander the Great.<br>" + "<br>"

		+ "Before the age of 33 Alexander had managed to conquer most of the known world, but then died from a fever. His<br>"
				+ "empire was taken over and split up by many of his generals, and thus weakened.<br>" + "<br>"

		+ "In 145 BCE Greece was taken over by Rome, and became a part of the Roman Empire.<br>" + "<br>"

		+ "</html>");

	}

}
