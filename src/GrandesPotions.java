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

    }

    @Override
    public String toString() {
        return "GrandesPotions{" +
                "name='" + name + '\'' +
                '}';
    }
}
