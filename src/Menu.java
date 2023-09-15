import java.util.Scanner;

public class Menu {
    private final Scanner scan = new Scanner(System.in);

    public void showMainMenu(){
        // Ask for options (create, update, exit, play...)

        System.out.println("Vous voulez creer , update , exit ");
        String answer = scan.nextLine();
        if (answer.contains("crier")) {
                createPersonnage();
        }else if (answer.contains("update")) {
            updatePersonnage();
        }else if (answer.contains("play")){

        }else if (answer.contains("exit")){
            exit();
        }
    }

    public void exit(){

    }

    public void updatePersonnage(){

    }

    public void playGame(){

    }

    public Personnage createPersonnage() {

        String typeChoice = null;
        while (typeChoice == null){
            typeChoice= askType(scan);
        }

        int forceAttaque = getForceAttaque(typeChoice);

        int niveauDeVie = getNiveauVie(typeChoice);

        String nomChoice = null;
        while (nomChoice == null) {
            nomChoice = Asknom(scan);
        }

        String attaque = null;
        while (attaque == null) {
            attaque = askArm(scan);
        }

        String defence = null ;
        while (defence == null) {
            defence = askDefence(scan);
        }

        return (new Personnage(typeChoice, nomChoice, niveauDeVie, forceAttaque, attaque, defence));

    }

    public int getForceAttaque(String typeChoice) {

        int forceAttaque;
        if (typeChoice.contains("guerrier")) {

            forceAttaque = 10;

        } else {

            forceAttaque = 15;

        }
        return forceAttaque;
    }

    public int getNiveauVie(String typeChoice) {
        int niveauDeVie;
        if (typeChoice.contains("guerrier")) {

            niveauDeVie = 10;

        } else {

            niveauDeVie = 6;

        }
        return niveauDeVie;
    }

    public String askType(Scanner scan) {
        System.out.println("Quel type de personnage voulez-vous créer? magicien || guerrier");
        String typeChoice = scan.nextLine();
        if (typeChoice.contains("guerrier")) {
            typeChoice = "guerrier";
            System.out.println("Votre Personnage Type est " + typeChoice);

        } else if (typeChoice.contains("magicien")) {
            typeChoice = "magicien";
            System.out.println("Votre Personnage Type est " + typeChoice);

        }else {
            typeChoice = null;

            System.out.println("Votre Personnage Type est non défini");

        }
        return typeChoice;
    }

    public String Asknom(Scanner scan) {
        System.out.println("Quel est le nom de personnage voulez-vous utiliser ?");
        String nomChoice = scan.nextLine();

        if (!nomChoice.isEmpty()) {
            System.out.println("Le nom choisi est " + nomChoice);

        } else if (nomChoice.isEmpty()){
            nomChoice = "toto";
            System.out.println("Votre nom par defaut est " + nomChoice);
        }else {
            nomChoice = null;

            System.out.println("Votre Personnage nom est non défini");

        }
        return nomChoice;
    }

    public String askArm(Scanner scan) {
        System.out.println("Quel est votre EquipementOffensif ? arme || sort");
        String attaque = scan.nextLine();

        if (attaque.contains("sort")) {
            attaque = "sort";
            System.out.println("Votre EquipementOffensif est " + attaque);
        } else if (attaque.contains("arme")){
            attaque = "arme";
            System.out.println("Votre EquipementOffensif est " + attaque);
        }else {
            attaque = null;

            System.out.println("Votre EquipementOffensif est non défini");

        }
        return attaque;
    }

    public String askDefence(Scanner scan) {
        System.out.println("Quel est votre EquipementDefensif ? bouclier || philtre");
        String defence = scan.nextLine();
        if (defence.contains("bouclier")) {
            defence = "bouclier";
            System.out.println("Votre EquipementDefensif est " + defence);
        } else if (defence.contains("philtre")){
            defence = "philtre";
            System.out.println("Votre EquipementDefensif est " + defence);
        }else {
            defence = null;

            System.out.println("Votre EquipementDefensif est non défini");

        }
        return defence;
    }

}
