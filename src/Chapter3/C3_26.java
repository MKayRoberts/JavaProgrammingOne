package Chapter3;

import java.util.Scanner;

/**
 * Program to check if inputted number is able to be divided by five, six,
 * and/or both
 *
 * @author makaylaroberts
 */

public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter value....");
        int userInt = input.nextInt();

        boolean partA = true;
        boolean partB = true;
        boolean partC = true;

        if (((userInt % 5) == 0) && ((userInt % 6) == 0)) {
            partA = true;
        } else {
            partA = false;
        }

        if (((userInt % 5) == 0) || ((userInt % 6) == 0)) {
            partB = true;
        } else {
            partB = false;
        }

        if (((userInt % 5) == 0) ^ ((userInt % 6) == 0)) {
            partC = true;
        } else {
            partC = false;
        }

        System.out.println("Is " + userInt + " divisible by 5 and 6? ");
        System.out.println(partA);

        System.out.println("Is " + userInt + " divisible by 5 or 6? ");
        System.out.println(partB);

        System.out.println("Is " + userInt + " divisible by 5 or 6, but not both? ");
        System.out.println(partC);
    }
}
