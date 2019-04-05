/**
 * Represents the Egypt civilization
 * 
 * @author Mohpreet Mankoo
 * @author Amitoj Purewal
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Egypt extends Civilization {

	public Egypt(Controller controller) {
		super(controller, Civilization.EGYPT);
	}

	@Override
	protected void buildHistoricalInfo() {

		historicalInfo = new JLabel[4]; // Number of labels

		historicalInfo[0] = new JLabel(
				"<html>" + "<h1> Predynastic Period </h1>"

		+ "Early settlers gather along the Nile Rive to farm and fish. They kept animals and built<br>"
				+ "permanent residences along the valley. <br>"

		+ "<h1> Early Dynastic Period </h1>"

		+ "Hieroglyphic developed. Narmer (Menes) unties Upper and Lower Egypt and become the first<br>"
				+ "pharaoh in history. <br>"

		+ "<h1> Old Kingdom </h1>"

		+ "The Pharaoh Djoser, along with the help of his famed visier Imhotep, builds the first pyramid<br>"
				+ "in Egypt, the Step Pyramid at Saqqara. It is built by stacking multiple steps of stone on top of <br>"
				+ "eachother, each one smaller than the one below it. This structure opens up the way for other pharoahs<br>"
				+ "to perfect the art of pyramid building. <br>"

		+ "Along with pyramids, this period is also around the time that the first mummifications happened and<br>"
				+ "when the Hieratic script was developed. Hieratic was the secular script of the people, being much <br>"
				+ "easier to write than Hieroglyphic script, which was used for religious and royal purposes. <br>"

		+ "The Pharaoh Sneferu builds the Bent Pyramid and the Red Pyramid (also called the North Pyramid). The Bent<br>"
				+ "Pyramid is a pyramid that changes it's angle of inclination about halfway up it's side. It is believed<br>"
				+ "by some historians that that the descision to change the angle was made during the building process <br>"
				+ "because the builders andarchitects were ill-prepared for the construction. However, in Sneferu's next<br>"
				+ "pyramid, the Red Pyramd, he was able to build the first true pyramid with smooth sides and a consistent<br>"
				+ "angle of inclination.<br>"

		+ "The Great Pyramids of Giza are built, each by a different pharaoh. The first, and largest, is built by<br>"
				+ "Khufu, the second, and second largest, is built by his son, Khafre. Historians argue that Khafre was also<br>"
				+ "the one to build the Great Sphinx. The third and smallest pyramid is built by Khafre's son Menkaure. <br>"

		+ "<h1> First Intermediate Period </h1>"

		+ "This period is noted for being A heavily unstable government contributed to the fall of the Egyptian <br>"
				+ "ruling system. During this period The nation again seperated into Upper and Lower Egypt, both ruled by <br>"
				+ "different rulers. <br>"

		+ "</html>");

		historicalInfo[1] = new JLabel(
				"<html>" + "<h1> Start of the Middle Kingdom in Egypt </h1>"
						+ "In 2055 BCE the pharoah Mentuhotep II restores peace to the political system of Egypt and reunites Lower <br>"
						+ "and Upper Egypt, ushering in the Middle Kingdom.<br>" + "<br>"

		+ "After a period of inactivity, during the Middle Kingdom pyramid building resumed, though never again on a<br>"
						+ "scale seen in the Old Kingdom. However, at Circa 1790 BCE the last pyramid was built, and Pharaohs were then<br>"
						+ "buired in tombs underground because pyramids were too visible and accessible for grave robbers.<br>"
						+ "<br>"

		+ "Also during this period, the earliest construction on the Temple of Karnak began. <br>" + "<br>"

		+ "In an effort to gain resources and land, the Egyptians gained control of Nubia, while maintaining peaceful<br>"
						+ "relations with the indigenous people.<br>" + "<br>"

		+ "The Middle Kingdom was brought to an end by the invasion of they Hyksos, a tribe from the middle east that<br>"
						+ "chariot building and combat, giving them the militiristic advantage over the Egyptians. The Hyksos continued <br>"
						+ "to rule Egypt until the start of the New Kingdom.<br>"

		+ "</html>");

		historicalInfo[2] = new JLabel(
				"<html>" + "<h1> Start of the New Kingdom in Egypt </h1>"
						+ "After the Hyskos were expelled from Egypt by pharoah Ahmose peace and political rest were reassured. The period<br>"
						+ "that followed known as the New Kingdom, is considered to be the most prosperous period in Egyptian history.<br>"
						+ "<br>"

		+ "In Circa 1470 BCE Hatshepsut became pharaoh and was the among the few females to rule Egypt. Her reign was very<br>"
						+ "controversial but she proved to be a very capapble ruler, and her rule was marked with progress and peace. However<br>"
						+ "after her death many statues and murals depicting her were destroyed by some of her successors. <br>"
						+ "<br>"

		+ "In the middle of the New Kingdom Ancient Egypt's most controversial pharoah Akhenaten came to power. He was a<br>"
						+ "religious heretic and radically reformed Egypt's religious system. At this time Egypt's entire political system<br>"
						+ "was based on their religion and thier beleif in a myriad of gods, however Akhenaten, sometimes referred to as <br>"
						+ "history's first monotheist, changed this and ordered that all must pray instead to, Aten, who he believed was <br>"
						+ "the only god. He dedicated his life to his religion and neglected other royal duties, letting his mother handle<br>"
						+ "those in his stead. Most of Egypt's citizens were very unhappy with these reforms, especially priests who used to<br>"
						+ "work in shrines dedicated to the old gods. Thus, when Akhenaten was succeeded by Tutankhamun, who was only a boy<br>"
						+ "at the time, the royal advisers convinced Tutankhamun to restore the old religion.<br>"
						+ "<br>"

		+ "At this point in time the use of the famed Book of the Dead had become common in mummification ceremonies. <br>"
						+ "<br>"

		+ "One of Egypt's most famous pharoahs, Ramesses II, ruled during this time. He is known for having fought at<br>"
						+ "the Battle of Q'desh (or Kadesh), and being a competent military leader. He had an abnormally long reign, 66<br>"
						+ "years, and outlived many of his own children. Somewhat of an egotist, Ramesses II had numerous gigantic statues<br>"
						+ "built for himself, along with temples were he depicted himself as the equal of the gods.<br>"
						+ "<br>"

		+ "After Ramesses II Egypt began its slow decline from the height of it's power and influence. The New Kingdom<br>"
						+ "was ended by the splitting of Egypt once again into an Upper and Lower portion, and the nation went on to be<br>"
						+ "ruled by many foreign powers.<br>"

		+ "</html>");

		historicalInfo[3] = new JLabel(
				"<html>" + "<h1> Start of the New Kingdom in Egypt </h1>"
						+ "During this period Egypt was attacked by the Nubians, Assyrians, and the Persians, all of whom controlled<br>"
						+ "the country during their respective period of rule. During the Persian rule, the famous Greek historian<br>"
						+ "Herodotus visited Egypt and wrote of their history and architecture. <br>" + "<br>"

		+ "In 332 BCE Alexander the Great conqered overthrew the Persians and was hailed as a hero by the Egyptians. <br>"
						+ "He became pharoah and Egypt was briefly ruled by Greece, until Cleopatra VII and Marc Antony were defeated<br>"
						+ "by the Romans at the battle of Actium. Egypt then became a Roman colony shortly before the common era began.<br>"

		+ "</html>");

	}

}
