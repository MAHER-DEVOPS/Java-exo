public abstract class EquipementDefensif {
    private String equipementDefensif;
    private int niveauDefense;
    private String nom;








    public EquipementDefensif(String equipementDefensif, int niveauDefense, String nom) {

        this.equipementDefensif = equipementDefensif;
        this.nom = nom;
        this.niveauDefense = niveauDefense;


    }

    public String getEquipementDefensif() {
        return equipementDefensif;
    }

    public int getNiveauDefense() {
        return niveauDefense;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "EquipementDefensif [equipementDefensif=" + equipementDefensif + ", niveauDefense=" + niveauDefense + ", nom=" + nom + "]";
    }

}
