package Chapter8;

import java.util.Scanner;

/**
 * Program that accepts input of salesman ID, day of the week, and total of sale
 * until told not to. Then, program prints out chart of data.
 *
 * @author makaylaroberts
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ID;// Sales man ID
        String inputDay; // Day of the week
        String again = ""; // If there is more data to enter
        int choice1 = 0; // Choice for sales man (0-A, 1-B, 2-C, 3-D)
        int choice2 = 0; // Choice for day of the week (0-M, 1-T, 2-W, 3-H, 4-F)
        double[][] sales = new double[4][5]; // 4 sales people 5 days of the week
        double sale = 0.0; // Sale for the day

        do {

            // You need a loop to keep asking for the sales man ID until a correct one is entered
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D....");
                ID = input.next().toUpperCase();
            } while (!ID.equals("A") && !ID.equals("B") && !ID.equals("C") && !ID.equals("D"));

            if (ID.equals("D")) {
                choice1 = 3;
            } else if (ID.equals("C")) {
                choice1 = 2;
            } else if (ID.equals("B")) {
                choice1 = 1;
            } else if (ID.equals("A")) {
                choice1 = 0;
            }

            // You need a loop to keep asking for the day until a correct one is entered
            do {
                System.out.print("Enter the day as M, T, W, H, or F.....");
                inputDay = input.next().toUpperCase();
            } while (!inputDay.equals("M") && !inputDay.equals("T") && !inputDay.equals("W") && !inputDay.equals("H") && !inputDay.equals("F"));

            if (inputDay.equals("M")) {
                choice2 = 0;
            } else if (inputDay.equals("T")) {
                choice2 = 1;
            } else if (inputDay.equals("W")) {
                choice2 = 2;
            } else if (inputDay.equals("H")) {
                choice2 = 3;
            } else if (inputDay.equals("F")) {
                choice2 = 4;
            }

            // Entering the sale 
            System.out.print("Enter the amount of the sale...");
            sale = input.nextDouble();

            sales[choice1][choice2] += sale;

            // Ask if there is more data to enter for the day. Keep asking until one enters Y/N
            do {
                System.out.println("Is there more data to input? Type Y to continue and N to end...");
                again = input.next().toUpperCase();
            } while (!again.equals("Y") && !again.equals("N"));
        } while (again.equals("Y"));

        // Display output once someone says there is no more data to enter.
        int salesID = 65;
        System.out.println("Salesman\tM\tT\tW\tH\tF");
        for (int row = 0; row < sales.length; row++) {
            System.out.print((char) salesID++ + "\t\t"); // Printing the letter of the sales ID
            for (int column = 0; column < sales[row].length; column++) {
                System.out.print(sales[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
