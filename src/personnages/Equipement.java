package personnages;

public enum Equipement {

    CASQUE("Casque"),
    BOUCLIER("Bouclier");

    private String name;

    Equipement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Equipement{" +
                "name='" + name + '\'' +
                '}';
    }
}
