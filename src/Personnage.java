/**
 * Cette class représente une personne avec un nom, type (magicien ou guerrier), niveau de vie, force attaque,
 * equipement offencif et equipement defensif
 */
public abstract class Personnage {
    private String nom;

    private String type;
    private int niveauDeVie;
    private int forceAttaque;
    private String equipementOffensif;
    private String equipementDefensif;


    /**
     * Constructeur pour créer une nouvelle instance de Personnage.
     */
    public Personnage() {
        this("");
    }


    /**
     * Constructeur pour créer une nouvelle instance de Personnage.
     *
     * @param nom
     */
    public Personnage(String nom) {
        //   this.nom = nom;
        this(nom, "");
    }

    /**
     * Constructeur pour créer une nouvelle instance de Personnage.
     *
     * @param nom  nom de la personne
     * @param type soit magicien ou guerrier
     */
    public Personnage(String nom, String type) {
        this(type, nom, 10, 2, "", "");
//        this.nom = nom;
//        this.type = type;
        //this(nom, type ); //this() for constructeurs , this.() for attributes
    }

    /**
     * Constructeur pour créer une nouvelle instance de Personnage.
     *
     * @param type               de la personne soit guerrier, soit magicien
     * @param nom                de la personne
     * @param niveauDeVie        de la personne
     * @param forceAttaque       de la personne
     * @param equipementOffensif de la personne soit arme ou sort et ça depend le type de la personne
     * @param equipementDefensif de la personne soit bouclier ou philtre et ça depend le type de la personne
     */
    public Personnage(String type, String nom, int niveauDeVie, int forceAttaque, String equipementOffensif, String equipementDefensif) {

        this.type = type;
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        this.forceAttaque = forceAttaque;
        this.equipementOffensif = equipementOffensif;
        this.equipementDefensif = equipementDefensif;
    }


    /**
     * Obtient le nom de la personne
     *
     * @return Le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient le type de la personne
     *
     * @return le type de la personne
     */
    public String getType() {
        return type;
    }

    /**
     * Obtient le niveau De vie de la personne
     *
     * @return le niveau De vie de la personne
     */
    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    /**
     * Obtient la force Attaque de la personne
     *
     * @return la force attaque de la personne
     */
    public int getForceAttaque() {
        return forceAttaque;
    }

    /**
     * Obtient la force Attaque de la personne
     *
     * @return la force Attaque de la personne
     */
    public String getEquipementOffensif() {
        return equipementOffensif;
    }

    /**
     * setter which sets the equipementOffiensif
     *
     * @param equipementOffensif to be set
     */
    public void setEquipementOffensif(String equipementOffensif) {
        this.equipementOffensif = equipementOffensif;
    }

    /**
     * Obtient l'equipement defensif de la personne
     *
     * @return l'equipement defensif de la personne
     */
    public String getEquipementDefensif() {
        return equipementDefensif;
    }

    /**
     * setter which sets the equipement Defensif
     *
     * @param equipementDefensif to be set
     */
    public void setEquipementDefensif(String equipementDefensif) {
        this.equipementDefensif = equipementDefensif;
    }

    /**
     * setter which sets the nom
     *
     * @param nom to be set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * setter which sets the type
     *
     * @param type to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * setter which sets the niveau de vie of the personne
     *
     * @param niveauDeVie to be set
     */
    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    /**
     * setter which sets the force Attaque of the personne
     *
     * @param forceAttaque to be set
     */
    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    /**
     * For Return a string representation of the personne
     *
     * @return Return a string representation of the personne attr
     */
    @Override
    public String toString() {
        return "Personnage [nom=" + nom + ", niveauDeVie=" + niveauDeVie + ", forceAttaque=" + forceAttaque
                + ", EquipementOffensif=" + equipementOffensif + ", EquipementDefensif=" + equipementDefensif + "]";
    }
}





