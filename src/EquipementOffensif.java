public abstract class EquipementOffensif {
    protected String equipementOffensif ;
    protected int niveauAttaque;
    protected String nom;

    public EquipementOffensif(String equipementOffensif, int niveauAttaque, String nom) {

        this.equipementOffensif = equipementOffensif;
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;


    }

    public String getEquipementOffensif() {
        return equipementOffensif;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "EquipementOffensif [equipementOffensif =" + equipementOffensif + ", niveauAttaque=" + niveauAttaque + ", nom=" + nom + "]";
    }
}




