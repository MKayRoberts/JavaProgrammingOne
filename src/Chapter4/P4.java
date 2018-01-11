package Chapter4;

import java.util.Scanner;

/**
 * Program accepts names, pay rates, and hours for a job before deciding which
 * bid is a better offer and displaying better offer
 *
 * @author makaylaroberts
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;
        int hours1, hours2;
        double pay1, pay2, cost1, cost2;

        System.out.println("Bidder one, enter your name.... ");
        name1 = input.nextLine();

        System.out.println("Enter number of hours needed: ");
        hours1 = input.nextInt();

        System.out.println("Enter pay rate requested: ");
        pay1 = input.nextDouble();
        input.nextLine();

        System.out.println("Bidder two, enter your name.... ");
        name2 = input.nextLine();

        System.out.println("Enter number of hours needed:  ");
        hours2 = input.nextInt();

        System.out.println("Enter pay rate requested:");
        pay2 = input.nextDouble();

        cost1 = hours1 * pay1;
        cost2 = hours2 * pay2;

        if ((cost2 == cost1) && (hours1 == hours2)) {
            System.out.printf(name1 + " and " + name2 + ", you have identical bids. You both bidded with " + hours1
                    + " hours at $%4.2f an hour with a total cost of $%4.2f.", pay1, cost1);
            System.out.println("");
        } else if (cost1 < cost2) {
            System.out.printf(name1 + " is the winner with the cost being $%4.2f", cost1);
        } else if (cost2 < cost1) {
            System.out.printf(name2 + " is the winner with their cost being $%4.2f", cost2);
        } else if (cost2 == cost1) {
            if (hours1 < hours2) {
                System.out.printf(name1 + " is the winner with the cost being $%4.2f in " + hours1 + " hours", cost1);
            } else {
                System.out.printf(name2 + " is the winner with the cost being $%4.2f in " + hours2 + " hours", cost2);
            }

        }
    }
}
