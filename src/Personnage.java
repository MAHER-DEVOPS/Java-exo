public class Personnage {
    private String nom;
    private String type;
    private int niveauDeVie;
    private int forceAttaque;
    private String EquipementOffensif ;
    private String EquipementDefensif;

    public Personnage() {
    }

    public Personnage(String Nom) {
        this.nom = Nom;
    }

    public String getNom() {
        return nom;
    }

    public Personnage(String Nom, String Type) {
        this.type = Type;

    }

    public String gettype() {
        return type;
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







