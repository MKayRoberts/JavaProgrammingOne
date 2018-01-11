package Chapter2;

import java.util.Scanner;

/**
 * Program to receive input and convert input to Fahrenheit before displaying
 * both the input and converted result
 *
 * @author makaylaroberts
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celsius;

        System.out.println("Enter temp in celsius...");
        Celsius = input.nextDouble(); // recieves temp in celcius

        double Fahrenheit = (9.0 / 5) * Celsius + 32;

        System.out.print("Your temp in celsius was " + Celsius);
        System.out.print(" which is " + Fahrenheit + " in fahrenheit.");
    }
}
