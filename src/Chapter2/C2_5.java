package Chapter2;

import java.util.Scanner;

/**
 * Program to receive input of subtotal and tipping rate before calculating and
 * displaying the tip and subtotal
 *
 * @author makaylaroberts
 */

public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subT, gratRate, total;

        System.out.println("Enter subtotal...");
        subT = input.nextDouble(); // recieves subtotal
        System.out.println("Enter gratuity rate...");
        gratRate = input.nextDouble(); // recieves tip rate

        double tip = gratRate / 100 * subT;
        total = subT + tip;

        System.out.println("Your tip is " + tip);
        System.out.println("Your total is " + total);
    }
}
