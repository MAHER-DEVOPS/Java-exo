public class Personnage {
    private String nom;

    private String type;
    private int niveauDeVie;
    private int forceAttaque;
    private String EquipementOffensif ;
    private String EquipementDefensif;

    public Personnage() {
    }

    public Personnage(String nom) {

        this.nom = nom;
    }


    public Personnage(String nom, String type) {
        this.nom = nom;
        this.type = type;


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

    public String getEquipementOffensif() {
        return EquipementOffensif;
    }

    public String getEquipementDefensif() {
        return EquipementDefensif;
    }
}

//   public Personnage (String Nom ,
//                       String EquipementDefensif,
//                       String EquipementOffensif,
//                       int NiveauDvie,
//                       int ForceAttaque){
//
//        this.nom = Nom;
//        this.niveauDvie = NiveauDvie;
//        this.forceAttaque = ForceAttaque;
//        this.equipementDefensif = EquipementDefensif;
//        this.equipementOffensif = EquipementOffensif;
//
//
//    }
//
//
//
//    public int getNiveauDvie() {
//        return niveauDvie;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public int getForceAttaque() {
//        return forceAttaque;
//    }
//
//    public String getEquipementOffensif() {
//        return equipementOffensif;
//    }
//
//    public String getEquipementDefensif() {
//        return equipementDefensif;
//    }







