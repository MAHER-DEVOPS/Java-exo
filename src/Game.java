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

    private Personnage personnage;

    private Menu menu;

    public Game(Menu menu) {
        this.menu=menu;
        this.playerPosition = 1;
        this.gameRunning = true;

//        this.menu = new Menu();

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



