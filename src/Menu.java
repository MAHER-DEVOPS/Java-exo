import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Menu {
    private final Scanner scan = new Scanner(System.in);

    public Personnage showMainMenu() {

        System.out.println("Vous voulez create 'personnage' , update 'personnage' , play , exit,  le jeu ");
        String answer = scan.nextLine();
        Personnage perso = null;
        if (answer.equals("create")) {
             perso = createPersonnage();

        } else if (answer.equals("update")) {
            System.out.println("Choisissez un nouveau nom pour update your personnage");
            perso = updatePersonnage();
        } else if (answer.equals("play")) {
            System.out.println("start - Démarrer la partie");
          playGame();
        } else if (answer.equals("exit")) {
            exit();
        }
        else{
            System.out.println("Merci de choisir parmis create , update , play ou exit le jeu ");
            showMainMenu();
        }
        return perso;

    }
    public void playGame() {
        System.out.println("Démarrage de la partie...");
        Game game = new Game();
        game.startGame();
    }

    public void exit() {
        System.out.println(" Merci Beaucoup , Au revoir ");

    }

    public Personnage createPersonnage() {

        String typeChoice = null;
        while (typeChoice == null) {
            typeChoice = askType(scan);
        }

        int forceAttaque = getForceAttaque(typeChoice);

        int niveauDeVie = getNiveauVie(typeChoice);

        String nomChoice = null;
        while (nomChoice == null) {
            nomChoice = Asknom(scan);
        }

        String attaque = null;
        while (attaque == null) {
            attaque = askArm(typeChoice);
        }

        String defence = null;
        while (defence == null) {
            defence = askDefence(typeChoice);
        }
        System.out.println("Votre " + typeChoice  + " est pret à jouer");
        return (new Personnage(typeChoice, nomChoice, niveauDeVie, forceAttaque, attaque, defence));


    }

    public int getForceAttaque(String typeChoice) {

        int forceAttaque;
        if (typeChoice.equals("guerrier")) {

            forceAttaque = 10;
            System.out.println("Votre attaqueForce est :" + forceAttaque);
        } else {

            forceAttaque = 15;
            System.out.println("Votre attaqueForce est :" + forceAttaque);
        }
        return forceAttaque;
    }

    public int getNiveauVie(String typeChoice) {
        int niveauDeVie;
        if (typeChoice.contains("guerrier")) {

            niveauDeVie = 10;
            System.out.println("Votre niveauDevie est :" + niveauDeVie);
        } else {

            niveauDeVie = 6;
            System.out.println("Votre niveauDevie est :" + niveauDeVie);
        }
        return niveauDeVie;
    }

    public String askType(Scanner scan) {
        System.out.println("Quel type de personnage voulez-vous créer? magicien || guerrier");
        String typeChoice = scan.nextLine();
        if (typeChoice.equals("guerrier")) {
            typeChoice = "guerrier";
            System.out.println("Votre Personnage Type est " + typeChoice);

        } else if (typeChoice.equals("magicien")) {
            typeChoice = "magicien";
            System.out.println("Votre Personnage Type est " + typeChoice);

        }
        return typeChoice;
    }

    public String Asknom(Scanner scan) {
        System.out.println("Quel est le nom de personnage voulez-vous utiliser ?");
        String nomChoice = scan.nextLine();

        if (!nomChoice.isEmpty()) {
            System.out.println("Le nom choisi est " + nomChoice);

        } else if (nomChoice.isEmpty()) {
            nomChoice = "toto";
            System.out.println("Votre nom par defaut est " + nomChoice);
        } else {
            nomChoice = null;

            System.out.println("Votre Personnage nom est non défini");

        }
        return nomChoice;
    }



    public String askArm(String typeChoice) {

        String attaque = scan.nextLine();

        if (typeChoice.equals("magicien")) {
            attaque = "sort";
            System.out.println("Votre EquipementOffensif est " + attaque);
        } else if (typeChoice.equals("guerrier")) {
            attaque = "arme";
            System.out.println("Votre EquipementOffensif est " + attaque);
        }
        return attaque;
    }

    public String askDefence(String typeChoice) {

        String defence = scan.nextLine();
        if (typeChoice.equals("magicien")) {
            defence = "philtre";
            System.out.println("Votre EquipementDefensif est " + defence);
        } else if (typeChoice.equals("guerrier")) {
            defence = "bouclier";
            System.out.println("Votre EquipementDefensif est " + defence);
        }
        return defence;
    }


    public Personnage updatePersonnage() {


        String typeChoice = askType(scan);
        int forceAttaque = getForceAttaque(typeChoice);
        int niveauDeVie = getNiveauVie(typeChoice);
        String defence = askDefence(typeChoice);
        String attaque = askArm(typeChoice);
        String nomupdate = updatenom(scan);

        //System.out.println("Choisissez votre type pour afficher ses information : magicien | guerrier");
        //String typeChoice = scan.nextLine();

        if (typeChoice.equals("magicien")) {

            System.out.println("Type : " + typeChoice);
            System.out.println("Nom :" + nomupdate);
            System.out.println("Niveau de vie :" + niveauDeVie );
            System.out.println("Force Attaque :" + forceAttaque );
            System.out.println("EquipementOffensif :" + attaque);
            System.out.println("EquipementDefensif : " + defence);
            //String nextChoice = scan.nextLine();
        } else if (typeChoice.equals("guerrier")) {
            System.out.println("Type " + typeChoice);
            System.out.println("Nom :" + nomupdate);
            System.out.println("Niveau de vie :" + niveauDeVie );
            System.out.println("Force Attaque :" + forceAttaque );
            System.out.println("EquipementOffensif :"+ attaque);
            System.out.println("EquipementDefensif : " + defence);
        }
        System.out.println("Voulez vous Update votre personnage ? oui | non ");
        String updateChoice = scan.nextLine();
        if (updateChoice.equals("non")) {
            playGame();
        } else if (updateChoice.equals("oui")) {
            //updatenom(scan);
            System.out.println("Type " + typeChoice);
            System.out.println("Nom :" + nomupdate);
            System.out.println("Niveau de vie :" + niveauDeVie );
            System.out.println("Force Attaque :" + forceAttaque );
            System.out.println("EquipementOffensif :"+ attaque);
            System.out.println("EquipementDefensif : " + defence);
        }
        System.out.println("Votre " + typeChoice  + " est pret à jouer");
        return (new Personnage(typeChoice, nomupdate, niveauDeVie, forceAttaque, attaque, defence));



    }
    public String updatenom(Scanner scan) {
        System.out.println("Quel est le nom de personnage voulez-vous utiliser ?");
        String nomupdate = scan.nextLine();

        if (!nomupdate.isEmpty()) {
            System.out.println("Le nom choisi est " + nomupdate);

        } else if (nomupdate.isEmpty()) {
            nomupdate = "toto";
            System.out.println("Votre nom par defaut est " + nomupdate);
        } else {
            nomupdate = null;

            System.out.println("Votre Personnage nom est non défini");

        }
        System.out.println("Votre niveau Nom est " + nomupdate);
        return nomupdate;

    }

}






//    public String askArm(Scanner scan) {
//        System.out.println("Quel est votre EquipementOffensif ? arme || sort");
//        String attaque = scan.nextLine();
//
//        if (attaque.equals("sort")) {
//            attaque = "sort";
//            System.out.println("Votre EquipementOffensif est " + attaque);
//        } else if (attaque.equals("arme")) {
//            attaque = "arme";
//            System.out.println("Votre EquipementOffensif est " + attaque);
//        } else {
//            attaque = null;
//
//            System.out.println("Votre EquipementOffensif est non défini");
//
//        }
//        return attaque;
//    }

//    public String askDefence(Scanner scan) {
//        System.out.println("Quel est votre EquipementDefensif ? bouclier || philtre");
//        String defence = scan.nextLine();
//        if (defence.equals("bouclier")) {
//            defence = "bouclier";
//            System.out.println("Votre EquipementDefensif est " + defence);
//        } else if (defence.equals("philtre")) {
//            defence = "philtre";
//            System.out.println("Votre EquipementDefensif est " + defence);
//        } else {
//            defence = null;
//
//            System.out.println("Votre EquipementDefensif est non défini");
//
//        }
//        return defence;
//    }

//}
