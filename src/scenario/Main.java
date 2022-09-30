package scenario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Main {

	public static void main(String[] args) {
		
		Druide pano = new Druide("Panoramix", 0, 10);
		
		pano.preparerPotion();
		
		Gaulois obelix = new Gaulois("Obélix", 10);
		
		pano.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste");
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		
		asterix.boirePotion(pano.getForcePotion());
		asterix.parler("Bonjour");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}
