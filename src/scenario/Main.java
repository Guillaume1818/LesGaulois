package scenario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Main {

	public static void main(String[] args) {

		//INSTANCES
		Druide pano = new Druide("Panoramix", 0, 10);
		Gaulois obelix = new Gaulois("Obélix", 10);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);

		//CALLS
		pano.preparerPotion();
		pano.booster(obelix);

		obelix.parler("Par Bélénos, ce n'est pas juste");
		asterix.boirePotion(pano.getForcePotion());
		asterix.parler("Bonjour");

		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}
