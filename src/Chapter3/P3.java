package Chapter3;

import java.util.Scanner;

/**
 * Program accepts two values and then displays which value is greater than or
 * less than the other, if they are equal, if they are a proper fraction, the
 * grade they would receive, and if they are in or out of range.
 *
 * @author makaylaroberts
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double var1, var2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first variable...");
        var1 = input.nextDouble();
        System.out.println("Enter second variable...");
        var2 = input.nextDouble();

        if (var1 < var2) {
            System.out.println("the first number is less than the second");
        } else if (var1 > var2) {
            System.out.println("The first number is greater than the second");
        } else if (var1 == var2) {
            System.out.println("The first number is equal to the second");
        }

        if (var1 <= var2) {
            System.out.println("The first number is less than or equal to the second");
        }

        if (var1 != var2) {
            System.out.println("The first number is not equal to the second");
        }

        if (var2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if ((var1 / var2) < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }

        if (var1 >= 90) {
            System.out.println("A");
        } else if (var1 >= 80) {
            System.out.println("B");
        } else if (var1 >= 70) {
            System.out.println("C");
        } else if (var1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((var2 >= 1) && (var2 <= 100)) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
