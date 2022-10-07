package personnages;

public class Chef {

    private String name;
    private int force;
    private int effetPotion = 1;
    private Village village;

    public Chef(String name, int force, Village village) {
        this.village = village;
        this.force = force;
        this.name = name;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public void frapper(Romain romain) {
        System.out.println(name + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force/3);
    }

    //VOID OUT
    public void parler(String txt) {
        System.out.println(prendreParole() + "<" + txt + ">");
    }

    public String prendreParole() {
        return "Le chef " + name + " du village " + village.getName() + ":";
    }

}
