package Chapter4;

import java.util.Scanner;

/**
 * Program accepts input for student major and year and displays the input as it
 * would be written out completely
 *
 * @author makaylaroberts
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Please enter student major and year..."); //ask for input    
        userInput = input.nextLine(); // get year and major

        if (userInput.equals("M1")) {
            System.out.println("Mathematics Freshman");
        } else if (userInput.equals("M2")) {
            System.out.println("Mathematics Sophomore");
        } else if (userInput.equals("M3")) {
            System.out.println("Mathematics Junior");
        } else if (userInput.equals("M4")) {
            System.out.println("Mathematics Senior");
        } else if (userInput.equals("I1")) {
            System.out.println("Information Technology Freshman");
        } else if (userInput.equals("I2")) {
            System.out.println("Information Technology Sophomore");
        } else if (userInput.equals("I3")) {
            System.out.println("Information Technology Junior");
        } else if (userInput.equals("I4")) {
            System.out.println("Information Technology Senior");
        } else if (userInput.equals("C1")) {
            System.out.println("Computer Science Freshman");
        } else if (userInput.equals("C2")) {
            System.out.println("Computer Science Sophomore");
        } else if (userInput.equals("C3")) {
            System.out.println("Computer Science Junior");
        } else if (userInput.equals("C4")) {
            System.out.println("Computer Science Senior");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
