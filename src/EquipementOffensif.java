public class EquipementOffensif {
    private String type;
    private int niveauAttaque;
    private String nom;

    public EquipementOffensif(String type, int niveauAttaque, String nom) {

        this.type = type;
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;


    }

    public String getType() {
        return type;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

}




