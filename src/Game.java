import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Game {
    private final Scanner scan = new Scanner(System.in);
    private final int PlateauSize = 64;
    private int playerPosition;
    private boolean gameRunning;
    private List<Case> plateau;



    private Personnage personnage;

    private Menu menu;

    public Game(Menu menu) {
        this.menu=menu;

        this.playerPosition = 1;
        this.gameRunning = true;
        //int positionJoueur = 0 ;
        plateau = new ArrayList<>();
        plateau.add(new CaseVide());
        plateau.add(new Ennemi());
        plateau.add ((Case) new Arme());
        plateau.add (new Potion());
        plateau.add(new Dragon());
        plateau.add(new Sourcier());
        plateau.add(new Gobelin());


        plateau.add((Case) new Mausse());
        plateau.add((Case) new Epee());
        plateau.add((Case) new Eclaire());
        plateau.add((Case) new BoulesDeFeu());
        plateau.add(new PotionStandards());
        plateau.add(new GrandesPotions());


    }


    public void choice(){
        System.out.println("Vous voulez show  ' info personnage' , update ' nom personnage' , create 'nom personnage' play 'jeu' , exit 'jeu' ");
        String choice = scan.nextLine();
        //String choice = menu.showMainMenu();
        switch (choice) {
            case "play" -> startGame();
            case "exit"  -> menu.exit();
            case "create" -> menu.createPersonnage();
            case "update" -> menu.updatePersonnage();
            case "show" -> menu.showInfo();
            case "" -> choice();
            }
        }


    public void startGame() {
        while (gameRunning) {
            int diceRoll = rollDice();
            movePlayer(diceRoll);
            displayGameProgress();
            if (playerPosition >= PlateauSize) {
                endGame();
            }
        }
    }
public void jouer_un_tour(){
int diceRoll = 1;

}
    private int rollDice() {

        return (int) (Math.random() * 6 + 1 ) ;
    }

    private void movePlayer(int steps) {
        playerPosition += steps;
    }

    private void displayGameProgress() {
        System.out.println("Avancement du joueur sur le plateau : case " + playerPosition + " / " + PlateauSize);
    }

    private void endGame() {
        System.out.println("Félicitations ! Vous avez terminé le jeu.");

        gameRunning = false;
    }
}

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

