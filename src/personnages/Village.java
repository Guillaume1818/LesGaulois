package personnages;

public class Village {

    private String name;
    private Chef chef;
    private int nbVillageois;
    private Gaulois[] villageois;

    public Village(String name, int nbVillageoisMax) {
        this.name = name;
        this.nbVillageois = 0;
        this.villageois = new Gaulois[nbVillageoisMax];
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public Gaulois trouverHabitant(int id) {
        return villageois[id];
    }

    //SETTERS
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void addHabitant(Gaulois gaulois) {
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
    }

    public void afficherVillageois() {
        System.out.println(name);
        System.out.println("Chef: " + chef.getName());
        for(int i = 0; i<nbVillageois; i++) {
            System.out.println("- " + trouverHabitant(i).getName());
        }
    }

    //MAIN TEST
    public static void main(String[] args) {
        Village v = new Village("Village des irréductibles", 30);
        //Gaulois gll = v.trouverHabitant(30);
        //Emplacement vide
        Chef chef = new Chef("Abraracourix", 6, v);

        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 25);

        v.setChef(chef);
        v.addHabitant(asterix);
        v.addHabitant(obelix);

        //Gaulois gl = v.trouverHabitant(1);
        //System.out.println(gl);
        v.afficherVillageois();
    }

}