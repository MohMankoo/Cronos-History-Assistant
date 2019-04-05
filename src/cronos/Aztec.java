/**
 * Represents the Aztec civilization
 * 
 * @author Mohpreet Mankoo
 * @author Inderbir Hair
 * @since 1.0
 */

package cronos;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Aztec extends Civilization {

	public Aztec(Controller controller) {
		super(controller, Civilization.AZTEC);
	}

	@Override
	protected void buildHistoricalInfo() {
		
		historicalInfo = new JLabel[3];
		
		historicalInfo[0] = new JLabel(
			   	"<html>"
			     	+ "<h1> Early Period in Mexico </h1>"
			     	+ "Around 700 CE the first Nahuatl speaking peoples begin to settle in Mexico. In 1110 CE the <br>"
			     	+ "Mexica migrate from their northern homeland of Aztlan to Lake Texcoco, in Chapultepec,<br>"
			     	+ "though are expelled by the Tepanecs. In 1299 CE the Mexica settle in Tizapan, with <br>"
			     	+ "permission of the Culhaucan ruler Cocoxtil. By 1325 CE Tenochtitlán is settled by the Mexica. <br>"
			     	+ "<br>"
			     + "</html>"
			     );

		historicalInfo[1] = new JLabel(
			   	"<html>"
			     	+ "<h1> Middle Period in Mexico </h1>"
			     	+ "Causeways are built with canals in 1350 CE. The religious ruler of the Mexica, Tenoch, dies <br>"
			     	+ "in 1370 CE. The first king, Acamapichitli, rules over Tenochititlan. Original construction of <br>"
			     	+ "Templo Mayor beings in Tenochtitlán in 1390 CE, the rule of Tenochititlan is passed over to<br>"
			     	+ "the second king, Huitzilihuitzli. <br>"
			     	+ "<br>"
			     + "</html>"
			     );

		historicalInfo[2] = new JLabel(
			   	"<html>"
			     	+ "<h1> Late Period in Mexico </h1>"
			     	+ "A short lived alliance is created with the Tepaneca, ending in war after the third king, Chimalpopoca,<br>"
			     	+ "is assassinated by the Tepaneca in 1427 CE. Azacpotzalco is conquered, a triple alliance between<br>"
			     	+ "the Mexica, Acolhua in the city Texcoco, and Tepaneca of Tlacopan, is formed in 1431 CE. <br>"
			     	+ "These cities become the foundation of the empire. By 1454 CE Tenochtitlán is severely <br>"
			     	+ "damaged by flooding, and famine. <br>"
			     	+ "</html>"
			     	);
	}
	
}
