public class Potion implements Case {
    private String name;

    public Potion() {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "c'est une potion pour augmenter la vie";
    }

    @Override
    public void interactPlayer(Personnage personnage) {
        int potionBonus = 20;
        personnage.setNiveauDeVie(personnage.getNiveauDeVie() + potionBonus);
        System.out.println(personnage.getNom() + "a bu une " + name + "potion pour augmenter sa vie");
    }

    @Override
    public String toString() {
        return "Potion{" +
                "name='" + name + '\'' +
                '}';
    }
}
