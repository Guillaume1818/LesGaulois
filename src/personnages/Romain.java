package personnages;

public class Romain {

	private String name;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement;
	private String texte;
	
	public Romain(String name, int force) {
		this.name = name;
		this.force = force;
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
	}

	//GETTERS
	public String getNom() {
		return name;
	}

	//VOID
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		//précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if(force > 0) {
			parler("Aie");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}

		if(force == 0) {
			parler("Aie");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		//post condition la force a diminué
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if(nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement, sa force est diminuée de ";
			for(int i = 0; i<nbEquipement; i++) {
				if(equipements[i] != null && equipements[i] == Equipement.BOUCLIER) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + name + " s'envole sous la force du coup");
		//TODO
		int nbEquipementEjec = 0;
		for(int i = 0; i<nbEquipement; i++) {
			if(equipements[i] != null) {
				equipementEjecte[nbEquipementEjec] = equipements[i];
				nbEquipementEjec++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
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
			default:
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
