package Chapter3;

import java.util.Scanner;

/**
 * Program accepts values for weight and price of two packages before
 * calculating and displaying which is a better deal
 *
 * @author makaylaroberts
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter value....");

        int weight1;
        int weight2;
        double price1;
        double price2;
        double unitPrice1;
        double unitPrice2;

        System.out.println("Enter weight of first rice package...");
        weight1 = input.nextInt();

        System.out.println("Enter price of first rice package....");
        price1 = input.nextDouble();

        System.out.println("Enter weight of second rice package...");
        weight2 = input.nextInt();

        System.out.println("Enter price of second rice package...");
        price2 = input.nextDouble();

        unitPrice1 = (weight1 / price1);
        unitPrice2 = (weight2 / price2);

        if (unitPrice1 < unitPrice2) {
            System.out.println("Package 1 is the better deal.");
        }
        if (unitPrice1 > unitPrice2) {
            System.out.println("Package 2 is the better deal.");
        }
        if (unitPrice1 == unitPrice2) {
            System.out.println("Packages are same price");
        }

    }
}
