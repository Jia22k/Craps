package CrapSim;
import java.util.Random;

/** Class simulating a game of craps 1000 times.
 * @author Jiana Kambo
 */
public class Craps {

    /** field storing the value of the dice */
    private static int dice;

    /** field storing the score of the shooter, essentially wins*/
    private static int shooterScore = 0;

    /**
     * Method that increases the score of the shooter everytime the shooter wins.
     * @param shooterScorePlay 1 or 0, win or loss , respectively
     */
    public static void setShooterScore(int shooterScorePlay){
        shooterScore = shooterScore + shooterScorePlay;
    }

    /**
     * Getter method for the shooter score
     * @return the value of the shooter score
     */
   public static int getShooterScore(){
        return shooterScore;
   }
    /**
     * Getter method for the current value of the dice
     * @return the value of the dice
     */
    public static int getDice(){
        return dice;
    }

    /**
     * Method used to Simulate the game play
     */
    public static void gameSim(){
        diceRoll();

        if ( dice == 2 || dice == 3 || dice == 12)
            setShooterScore(0);
        if (dice == 7 || dice ==11)
            setShooterScore(1);
        else {
            int point = getDice();
            diceRoll();
            while (dice != point && dice != 7) {
                diceRoll();
            }
            if (dice == point)
                setShooterScore(1);
            if (dice == 7)
                setShooterScore(0);
        }
    }

    /**
     * Method used to simulate the roll of a dice
     */
    public static void diceRoll(){
        Random rand = new Random();
        int diceOne = rand.nextInt(7);
        int diceTwo = rand.nextInt(7);
        dice = diceOne+diceTwo;
    }

    /**
     * Main method plays the game 100000 times and prints out the outcome : How many wins vs losses
     * @param args, not used here
     */
    public static void main(String[] args){
        int j = 0;
        while (j<100000){
            gameSim();
            j++;
        }
        int loss = 100000 - getShooterScore();

        System.out.println("The number of wins in the game simluation was  " + loss);
        System.out.println("The number of losses in the game simluation was  " + getShooterScore());
    }
    }

