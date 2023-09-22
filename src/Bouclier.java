public class Bouclier extends EquipementDefensif {
public Bouclier(){
   super("bouclier", 10 , "fighter");

}

   @Override
   void showEquipementinfo() {
      System.out.println("testing abstract feature");
   }
}
