public  class Personnage {
    private String nom;

    private String type;
    private int niveauDeVie;
    private int forceAttaque;
    private String equipementOffensif;
    private String equipementDefensif;

    public Personnage() {

    }

    public Personnage(String nom) {
        this.nom = nom;

    }


    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;
        //this(nom, type ); //this() for constructeurs , this.() for attributes
    }

    public Personnage(String type ,String nom, int niveauDeVie, int forceAttaque, String equipementOffensif,String equipementDefensif ) {

        if (type.equals("magicien")) {
            this.nom = nom;

            this.type = type;
            this.niveauDeVie = niveauDeVie;
            this.forceAttaque = forceAttaque;
            this.equipementOffensif = equipementOffensif;
            this.equipementDefensif = equipementDefensif;
        } else if (type.equals("guerrier")) {
            this.nom = nom;
            this.type = type;
            this.niveauDeVie = niveauDeVie;
            this.forceAttaque = forceAttaque;
            this.equipementOffensif = equipementOffensif;
            this.equipementDefensif = equipementDefensif;
        }
    }
    public String getNom() {
        return nom;
    }


    public String getType() {
        return type;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

//    public EquipementOffensif getEquipementOffensif() {
//        return equipementOffensif;
//    }

//    public void setEquipementOffensif(EquipementOffensif equipementOffensif) {
//        this.equipementOffensif = equipementOffensif;
//    }
//
//    public void setEquipementDefensif(EquipementDefensif equipementDefensif) {
//        this.equipementDefensif = equipementDefensif;
//    }


    public String getEquipementOffensif() {
        return equipementOffensif;
    }

    public void setEquipementOffensif(String equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    public String getEquipementDefensif() {
        return equipementDefensif;
    }

    public void setEquipementDefensif(String equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    @Override
    public String toString() {
        return "Personnage [nom=" + nom + ", niveauDeVie=" + niveauDeVie + ", forceAttaque=" + forceAttaque
                + ", EquipementOffensif=" + equipementOffensif + ", EquipementDefensif=" + equipementDefensif + "]";
    }
}





