public class GrandesPotions implements Case{
private String name;

public GrandesPotions(){
    this.name = "Grande Potion";
}
    @Override
    public String getDescription() {
        return "C'est une grande potion pour augmenter votre vie";
    }

    @Override
    public void interactPlayer(Personnage personnage) {
    int grandPotionBonus = 40;
    personnage.setNiveauDeVie(personnage.getNiveauDeVie() + grandPotionBonus);
        System.out.println(personnage.getNom() + "il a récupéré beaucoup de vie ");

    }

    @Override
    public String toString() {
        return "GrandesPotions{" +
                "name='" + name + '\'' +
                '}';
    }
}
