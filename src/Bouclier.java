public class Bouclier extends EquipementDefensif {
    public Bouclier() {
        super("bouclier", 10, "fighter");

    }

    @Override
    public void showEquipementinfo() {
        System.out.println("testing abstract feature");
    }
}
