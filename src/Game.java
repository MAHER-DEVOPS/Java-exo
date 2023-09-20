public class Game {
    private final int PlateauSize = 64;
    private int playerPosition;
    private boolean gameRunning;

    public Game() {
        this.playerPosition = 1;
        this.gameRunning = true;
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

        return (int) (Math.random() * 6) ;
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
