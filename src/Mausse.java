public class Mausse implements Case{
    public Mausse() {
    }


    @Override
    public String toString() {
        return "Mausse{}";
    }

    @Override
    public String getDescription() {
        return "C'est une massue pour vous aider ";
    }

    @Override
    public void interactPlayer(Personnage personnage) {
        if (personnage instanceof Guerrier) {
            Guerrier guerrier = (Guerrier) personnage;
            guerrier.setEquipementOffensif(("mausse"));
            System.out.println(guerrier.getNom() + " a trouvé une massue");

        }else if (personnage instanceof Magicien){
            System.out.println(personnage.getNom() + "il peut pas ramasser massue");
        }
    }

}

