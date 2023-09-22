import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Menu {
    private final Scanner scan = new Scanner(System.in);

    public void playGame() {
        System.out.println("Démarrage de la partie...");
        Game game = new Game();
        game.startGame();
    }

    public void exit() {
        System.out.println(" Merci Beaucoup , Au revoir ");

    }

    /**
     *
     * @return Quelque chose
     */
    public Personnage ShowInfo() {
        String typeChoice = askType();
        Personnage perso = null;
        if (typeChoice.equals("guerrier")) {
            perso = new Guerrier("guerrier", "fighter", 10, 10, "arme", "bouclier");
            System.out.println("Les Info Par defaut du Votre " + typeChoice + " sont " + perso);


        } else if (typeChoice.equals("magicien")) {
            perso = new Magicien("magicien", "defender", 6, 15, "sort", "philtre");
            System.out.println("Les Info Par defaut du Votre " + typeChoice + " sont " + perso);

        }
        return perso;
    }

    /**
     *
     */
    public void createPersonnage() {

        String typeChoice = null;
        while (typeChoice == null) {
            typeChoice = askType();
        }

        int forceAttaque = getForceAttaque(typeChoice);

        int niveauDeVie = getNiveauVie(typeChoice);

        String nomChoice = null;
        while (nomChoice == null || nomChoice.isEmpty()) {
            ExceptionHandling ex = new ExceptionHandling("Nom cannot be empty");
            try {
                nomChoice = Asknom();
                if (nomChoice.isEmpty()){

                    throw ex;
                }
            } catch (ExceptionHandling e){ // object e / FOR ALL KIND OF EXCEPTIONS . EXCEPTION PARENT / but it is slower
                System.err.println("Invalide input for nom " + e.getMessage());
                e.printStackTrace(); //the problem is in which line
            }

        }

        String attaque = null;
        while (attaque == null) {
            attaque = askArm(typeChoice);
        }

        String defence = null;
        while (defence == null) {
            defence = askDefence(typeChoice);
        }
        System.out.println("Votre " + typeChoice + "/" + nomChoice + " est pret à jouer");
        //return (new Personnage(typeChoice, nomChoice, niveauDeVie, forceAttaque, attaque, defence));


    }

    /**
     *
     * @param typeChoice Est un String
     * @return un entier
     */
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

    /**
     *
     * @param typeChoice
     * @return Entier
     */
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

    public String askType() {
        System.out.println("Quel type de personnage voulez-vous choisir? magicien || guerrier");
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

    public String Asknom() {
        System.out.println("Quel est le nom de personnage voulez-vous utiliser ?");
        String nomChoice = scan.nextLine();

        if (!nomChoice.isEmpty()) {
            System.out.println("Le nom choisi est " + nomChoice);

        } else if (nomChoice.isEmpty()) {
            nomChoice = "toto";
            System.out.println("Votre nom est " + nomChoice);
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


    public void updatePersonnage() {


        String typeChoice = askType();
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
            System.out.println("Niveau de vie :" + niveauDeVie);
            System.out.println("Force Attaque :" + forceAttaque);
            System.out.println("EquipementOffensif :" + attaque);
            System.out.println("EquipementDefensif : " + defence);
            //String nextChoice = scan.nextLine();
        } else if (typeChoice.equals("guerrier")) {
            System.out.println("Type " + typeChoice);
            System.out.println("Nom :" + nomupdate);
            System.out.println("Niveau de vie :" + niveauDeVie);
            System.out.println("Force Attaque :" + forceAttaque);
            System.out.println("EquipementOffensif :" + attaque);
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
            System.out.println("Niveau de vie :" + niveauDeVie);
            System.out.println("Force Attaque :" + forceAttaque);
            System.out.println("EquipementOffensif :" + attaque);
            System.out.println("EquipementDefensif : " + defence);
        }
        System.out.println("Votre " + typeChoice + nomupdate + " est pret à jouer");
        //return (new Personnage(typeChoice, nomupdate, niveauDeVie, forceAttaque, attaque, defence));


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
