package personnages;

import java.util.Random;

public class Druide {

	private String name;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String name, int effetPotionMin, int effetPotionMax) {
		this.name = name;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis Druide " + name + " et ma potion peut aller de " + effetPotionMin + " à " + effetPotionMax);
	}

	//GETTERS
	public String getNom() {
		return name;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}

	public String prendreParole() {
		return "Le Druide " + name + " :";
	}

	public void parler(String txt) {
		System.out.println(prendreParole() + " <" + txt + ">");
	}
	
	//VOID
	public void preparerPotion() {
		Random r = new Random();
		forcePotion = r.nextInt(effetPotionMin, effetPotionMax);
		if(forcePotion>7) {
			parler("J'ai préparé une super potion de force");
		} else {
			parler("Je n'ai pas trouvé les ingrédients, ma potion est seulement de force");
		}
	}

	public void booster(Gaulois g) {
		if(g.getName().equals("Obélix")) {
			System.out.println("Non, pas de potion pour Obélix");
		}
	}

	//MAIN TEST
	public static void main(String[] args) {
		Druide p = new Druide("Panoramix", 5, 10);
		p.preparerPotion();
		System.out.println(p.getForcePotion());
	}

}
