package personnages;

public class Gaulois {
	
	private String name;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
	}

	//GETTERS
	public String getName() {
		return name;
	}
	
	public int getForce() {
		return force;
	}

	//TO STRING
	public String toString() {
		return "Gaulois [nom=" + name + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	//VOID OUT
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String prendreParole() {
		return "Le Gaulois " + name + ": ";
	}

	//VOID
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci : " + forcePotion + "x force");
	}

	public void frapper(Romain romain) {
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	//MAIN TEST
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Asterix", 1);
		g.boirePotion(3);
	}
	
	
}
