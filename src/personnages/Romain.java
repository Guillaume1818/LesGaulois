package personnages;

public class Romain {

	private String name;
	private int force;
	
	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
	}
	
	public String getNom() {
		return name;
	}
	
	public void parler(String txt) {
		System.out.println(prendreParole() + "<" + txt + ">");
	}
	
	public String prendreParole() {
		return "Le romain " + name + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -=forceCoup;
		if(force>0) {
			parler("AIE");
		} else {
			parler("J'abandonne...");
		}
	}
	
	
}
