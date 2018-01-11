package Chapter5;

import java.util.Scanner;

/**
 * Program plays rock paper scissors against user until either computer or user
 * has won more than two times.
 *
 * @author makaylaroberts
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        int yes = 0, no = 0, tester = 0;

        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting.");
        System.out.println("Enter vote...");
        userInput = input.nextLine();
        if (userInput.equals("q")) {
            tester = 1;
        }
        if (userInput.equals("Q")) {
            tester = 1;
        }

        while (tester != 1) {
            if (userInput.equals("Y")) {
                ++yes;
            }
            if (userInput.equals("y")) {
                ++yes;
            }
            if (userInput.equals("N")) {
                ++no;
            }
            if (userInput.equals("n")) {
                ++no;
            }

            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting.");
            System.out.println("Enter vote...");
            userInput = input.nextLine();

            if (userInput.equals("q")) {
                tester = 1;
            }
            if (userInput.equals("Q")) {
                tester = 1;
            }
        }

        if (userInput.equals("Q")) {
            System.out.println("'yes' votes: " + yes);
            System.out.println("'no' votes: " + no);
        }
        if (userInput.equals("q")) {
            System.out.println("'yes' votes: " + yes);
            System.out.println("'no' votes: " + no);
        }
    }
}
