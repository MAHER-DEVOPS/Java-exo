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

    }
    @Override
    public String toString() {
        return "PotionStandards{" +
                "name='" + name + '\'' +
                '}';
    }
}
