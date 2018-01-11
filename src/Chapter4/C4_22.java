package Chapter4;

import java.util.Scanner;

/**
 * Program accepts two strings as input before displaying if the second input is
 * a substring of the first
 *
 * @author makaylaroberts
 */

public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert first string...");//ask for input
        String userInput1 = input.nextLine();
        System.out.println("Insert second string...");
        String userInput2 = input.nextLine();

        if (userInput1.contains(userInput2)) {
            System.out.println(userInput2 + " is a substring of " + userInput1);
        } else {
            System.out.println(userInput2 + " is not a substring of " + userInput1);
        }
    }
}
