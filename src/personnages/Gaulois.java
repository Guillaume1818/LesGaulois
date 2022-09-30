package personnages;

public class Gaulois {
	
	private String name;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String name, int force) {
		this.name = name;
		this.force = force;
	}

	public String getName() {
		return name;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public String prendreParole() {
		return "Le gaulois " + name + " : ";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci : " + forcePotion + "x force");
	}

	public void frapper(Romain romain) {
		System.out.println(name + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	public String toString() {
		return "Gaulois [nom=" + name + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois g = new Gaulois("Asterix", 1);
		g.boirePotion(3);
	}
	
	
}
