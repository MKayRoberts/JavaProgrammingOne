package Chapter3;

import java.util.Scanner;

/**
 * Program to play a game of heads v. tails with computer
 *
 * @author makaylaroberts
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerGen = (int) (Math.random() * 2);
        String playerGuessHu = "Invalid";
        String computerGenHu = "Invalid";

        if (computerGen == 0) {
            computerGenHu = "heads";
        } else {
            computerGenHu = "tails";
        }

        System.out.println("You will be guessing heads or tails.");
        System.out.println("In order to guess heads, please enter '0'...");
        System.out.println("In order to guess tails, please enter '1'...");
        System.out.println("Please guess now....");
        int playerGuess = input.nextInt();

        if (playerGuess == 0) {
            playerGuessHu = "heads";
        }
        if (playerGuess == 1) {
            playerGuessHu = "tails";
        }

        if (playerGuess == computerGen) {
            System.out.println("Your guess was correct! The answer was " + playerGuessHu + "!");
        }

        if (playerGuess != computerGen) {
            System.out.println("Your guess was incorrect...");
            System.out.println("You guessed " + playerGuessHu + " but the correct answer was "
                    + computerGenHu + "...");
        }

    }
}
