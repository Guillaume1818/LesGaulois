package personnages;

public class Romain {

	private String name;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement;
	
	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
		assert force>0;
	}

	//GETTERS
	public String getNom() {
		return name;
	}

	//VOID
	public void recevoirCoup(int forceCoup) {
		assert forceCoup>0;
		int init = force;
		force -=forceCoup;
		if(force>0) {
			parler("AIE");
		} else {
			parler("J'abandonne...");
		}
		assert force<init;
	}

	public void sEquiper(Equipement e) {
		switch(nbEquipement) {
			case 0:
				equipements[0] = e;
				System.out.println("Le soldat " + name  + " s'équipe avec un " + e.getName() + " !");
				nbEquipement++;
				break;
			case 1:
				if(!equipements[0].equals(e)) {
					equipements[1] = e;
					nbEquipement++;
					System.out.println("Le soldat " + name  + " s'équipe avec un " + e.getName() + " !");
				} else {
					System.out.println("Le soldat " + name  + " possède déjà un " + e.getName() + " !");
				}
				break;
			case 2:
				System.out.println("Le soldat " + name + " est déjà bien protégé !");
				break;
		}
	}

	//VOID OUT
	public void parler(String txt) {
		System.out.println(prendreParole() + "<" + txt + ">");
	}
	
	public String prendreParole() {
		return "Le romain " + name + ": ";
	}



	//MAIN TEST
	public static void main(String[] args) {
		Romain r = new Romain("Minus", 3);
		r.sEquiper(Equipement.CASQUE);
		r.sEquiper(Equipement.CASQUE);
		r.sEquiper(Equipement.BOUCLIER);
		r.sEquiper(Equipement.CASQUE);
	}

}
