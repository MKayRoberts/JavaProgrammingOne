package Chapter5;

import java.util.Scanner;

/**
 * Program accepts string as input before reversing and displaying string
 *
 * @author makaylaroberts
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput, userReverse;
        int length;

        System.out.println("Enter a string: ");
        userInput = input.nextLine();
        length = userInput.length();
        userReverse = "";

        for (int i = length - 1; i >= 0; i--) {
            userReverse = userReverse + userInput.charAt(i);
        }
        System.out.println("The reversed string would be " + userReverse);
    }

}
