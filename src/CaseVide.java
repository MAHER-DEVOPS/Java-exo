public class CaseVide implements Case {

    private String name;

    public CaseVide (){
        this.name ="Case Vide";
    }
     @Override
    public String getDescription(){
        return "C'est une case vide !";
     }

    @Override
    public void interactPlayer(Personnage personnage) {
        System.out.println("Cette case est vide, persronne peut passer");
    }


}
