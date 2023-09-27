import java.sql.SQLOutput;
import java.util.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class Game {
    private final Scanner scan = new Scanner(System.in);
    private final int PlateauSize = 64;
    private int playerPosition;
    private boolean gameRunning;
    private List<Case> plateau = new ArrayList<Case>();
    private int positionJoueur;


    private Personnage personnage;

    private Menu menu;

    public Game(Menu menu) {
        this.menu = menu;
       // Set<Case>plateau= new HashSet<>();
        this.playerPosition = 1;
        this.gameRunning = true;
        //int positionJoueur = 0 ;
        plateau = new ArrayList<>();
        plateau.add(new CaseVide());
        plateau.add(new Ennemi());
        plateau.add((Case) new Arme());
        plateau.add(new Potion());
        plateau.add(new Dragon());
        plateau.add(new Sourcier());
        plateau.add(new Gobelin());
        //plateau.remove();



        plateau.add(new Mausse());
        plateau.add((Case) new Epee());
        plateau.add((Case) new Eclaire());
        plateau.add((Case) new BoulesDeFeu());
        plateau.add(new PotionStandards());
        plateau.add(new GrandesPotions());


    }


    public void choice() {
        System.out.println("Vous voulez show  ' info personnage' , update ' nom personnage' , create 'nom personnage' play 'jeu' , exit 'jeu' ");
        String choice = scan.nextLine();
        //String choice = menu.showMainMenu();
        switch (choice) {
            case "play" -> startGame();
            case "exit" -> menu.exit();
            case "create" -> menu.createPersonnage();
            case "update" -> menu.updatePersonnage();
            case "show" -> menu.showInfo();
            case "" -> choice();
        }
    }

    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public void movePlayer(int steps) {

        playerPosition += steps;
    }

    public void displayGameProgress() {
        System.out.println("Avancement du joueur sur le plateau : case " + playerPosition + " / " + PlateauSize);
    }


    public void encounterEnemy() {

        Case currentCase = plateau.get(playerPosition - 1);
        if (currentCase instanceof Ennemi) {
            Ennemi enemy = (Ennemi) currentCase;

            System.out.println("Vous etes enface d'un Ennemi!");
            System.out.println("Choose your action:");
            System.out.println("1. attaque");
            System.out.println("2. run");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {

                personnage.attaquer(personnage);
                if (enemy.isAlive()) {
                    enemy.attaquer(personnage);
                } else {
                    plateau.set(playerPosition - 1, new CaseVide());
                }
            } else if (choice == 2) {

                int stepsToMove = (int) (Math.random() * 6) + 1;
                System.out.println("You chose to flee. Moving " + stepsToMove + " steps back.");
                movePlayer(-stepsToMove);
            }
        }
    }

    public void startGame() {
        while (gameRunning) {
            int diceRoll = rollDice();
            movePlayer(diceRoll);
            displayGameProgress();
            Case currentCase = plateau.get(playerPosition - 1);

            // Check if the current case is an enemy
            if (currentCase instanceof Ennemi) {
                System.out.println("You encountered an enemy!");
                System.out.println("Choose your action: 1. Attack | 2. Flee");
                int choice = scan.nextInt();
                scan.nextLine(); // Consume newline

                if (choice == 1) {
                    personnage.attaquer(personnage);
                    ((Ennemi) currentCase).attaquer(personnage);
                } else if (choice == 2) {
                    int stepsToMove = (int) (Math.random() * 6) + 1;
                    System.out.println("You chose to flee. Moving " + stepsToMove + " steps back.");
                    movePlayer(-stepsToMove);
                }
            }

            if (playerPosition >= PlateauSize) {
                endGame();
            }
        }
    }

    public void jouer_un_tour() {

        int diceRoll = 1;


        positionJoueur += diceRoll;


        if (positionJoueur >= plateau.size()) {
            positionJoueur = plateau.size() - 1;
        }


        Case currentCase = plateau.get(positionJoueur);
        System.out.println(currentCase.getDescription());


    }

    public void endGame() {
        System.out.println("Félicitations ! Vous avez terminé le jeu.");
        gameRunning = false;
    }

    public void addCase(Case newCase) {
        plateau.add(newCase);
        System.out.println("Added a new case to the game board.");
    }

    public void removeCase(int index) {
        if (index >= 0 && index < plateau.size()) {
            Case removedCase = plateau.remove(index);
            System.out.println("Removed case at index " + index + ": " + removedCase.getDescription());
        } else {
            System.out.println("Invalid index. No case removed.");
        }
    }

    public Case findCase(String description) {
        for (Case aCase : plateau) {
            if (aCase.getDescription().equalsIgnoreCase(description)) {
                return aCase;
            }
        }
        System.out.println("Case with description '" + description + "' not found.");
        return null;
    }

    public void listCases() {
        System.out.println("List of Cases on the Game Board:");
        for (Case aCase : plateau) {
            System.out.println(" " + aCase.getDescription());
        }
    }

}

//    public void startGame(Personnage ennemi) {
//        while (gameRunning) {
//            int diceRoll = rollDice();
//            movePlayer(diceRoll);
//            displayGameProgress();
//            if (playerPosition >= PlateauSize) {
//                endGame();
//            }
//        }
//    }
//public void jouer_un_tour(){
//int diceRoll = 1;
//
//}
//    private int rollDice() {
//
//        return (int) (Math.random() * 6 + 1 ) ;
//    }
//
//    private void movePlayer(int steps) {
//        playerPosition += steps;
//    }
//
//    private void displayGameProgress() {
//        System.out.println("Avancement du joueur sur le plateau : case " + playerPosition + " / " + PlateauSize);
//    }
//
//    private void endGame() {
//        System.out.println("Félicitations ! Vous avez terminé le jeu.");
//
//        gameRunning = false;
//    }
//}

//    public void addCase(Case newCase) {
//        plateau.add(newCase);
//        System.out.println("Added a new case to the game board.");
//    }
//    public Case findCase(String description) {
//        for (Case aCase : plateau) {
//            if (aCase.getDescription().equalsIgnoreCase(description)) {
//                return aCase;
//            }
//        }
//        System.out.println("Case with description '" + description + "' not found.");
//        return null;
//    }
//
//    public void listCases() {
//        System.out.println("List of Cases on the Game Board:");
//        for (Case aCase : plateau) {
//            System.out.println("- " + aCase.getDescription());
//        }
//    }

