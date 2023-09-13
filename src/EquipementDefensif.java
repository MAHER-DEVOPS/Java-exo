public class EquipementDefensif {
    private String type;
    private int niveauDefense;
    private String nom;








    public EquipementDefensif(String type, int niveauDefense, String nom) {

        this.type = type;
        this.nom = nom;
        this.niveauDefense = niveauDefense;


    }

    public String getType() {
        return type;
    }

    public int getNiveauDefense() {
        return niveauDefense;
    }

    public String getNom() {
        return nom;
    }
}
