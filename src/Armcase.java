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
        if (personnage instanceof Guerrier) {
            Guerrier guerrier = (Guerrier) personnage;
            guerrier.setEquipementOffensif(("arme"));
            System.out.println(guerrier.getNom() + " a trouvé une arme");

        }else if (personnage instanceof Magicien){
            System.out.println(personnage.getNom() + "il peut pas ramasser d'arme");
        }
    }

}
