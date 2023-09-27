public class Ennemi implements Case{
private String name;
private int health;
private int forceAttaque;

    public Ennemi (){
this.name = name;
this.health = health;
this.forceAttaque = forceAttaque;

    }

    public void attaquer (Personnage personnage){
        int damage = forceAttaque;
        personnage.subirDegats(damage);
    }

    public boolean isAlive(){
        return health >0;}

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void interactPlayer(Personnage personnage) {
        System.out.println("Combat avec " + name);
        attaquer(personnage);
    }

    @Override
    public String toString() {
        return "Ennemi{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", forceAttaque=" + forceAttaque +
                '}';
    }
}
