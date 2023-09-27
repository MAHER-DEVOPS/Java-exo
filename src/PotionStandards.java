public class PotionStandards implements Case{

private String name;

public PotionStandards () {
    this.name = "Potion Standard";
}



    @Override
    public String getDescription() {
        return "C'est un potion Standard pour augmenter votre vie";
    }

    @Override
    public void interactPlayer(Personnage personnage) {
int potionBonus = 10;
    personnage.setNiveauDeVie(personnage.getNiveauDeVie() + potionBonus);
        System.out.println(personnage.getNom() + "il a bu potion Standard et récupéré de la vie");
    }
    @Override
    public String toString() {
        return "PotionStandards{" +
                "name='" + name + '\'' +
                '}';
    }
}
