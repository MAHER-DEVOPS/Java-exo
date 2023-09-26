public class Armcase implements Case{
    private String nom;
    private int bonusAttaque;

    public Armcase(String nom, int bonusAttaque) {
        this.nom = nom;
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public String getDescription() {
        return ("Arme : " + nom + " Bonus Attaque : " + bonusAttaque );
    }

    @Override
    public void interactPlayer(Personnage personnage) {
        System.out.println("Cette case est vide, persronne peut passer");
    }

}
