package Chapter6;

import java.util.Scanner;

/**
 * Program accepts conversion rates from user before calculating entered amounts
 * of USD into selected currency until user decides to quit program.
 *
 * @author makaylaroberts
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Euro, Pound, Yen, dollars, e, p, y;
        String cont = "yes", choice;

        System.out.println("How many Euros will a dollar buy?");
        Euro = input.nextDouble();
        System.out.println("How many Pounds Sterling will a dollar buy?");
        Pound = input.nextDouble();
        System.out.println("How many Yen will a dollar buy?");
        Yen = input.nextDouble();

        while (cont.equalsIgnoreCase("yes")) {
            System.out.print("Enter amount in dollars you'd like to convert... $");
            dollars = input.nextDouble();
            System.out.print("Enter 'E' to buy Euros, 'P' to buy Pounds, or 'Y' to buy Yen...");
            choice = input.next();

            if (choice.equalsIgnoreCase("e")) {
                e = convert4me(dollars, Euro);
                System.out.printf("With $%4.2f dollars , you can purchase %4.2f euros", dollars, e);
            } else if (choice.equalsIgnoreCase("y")) {
                y = convert4me(dollars, Yen);
                System.out.printf("With $%4.2f dollars , you can purchase %4.2f yen", dollars, y);
            } else if (choice.equalsIgnoreCase("p")) {
                p = convert4me(dollars, Pound);
                System.out.printf("With $%4.2f dollars , you can purchase %4.2f pounds", dollars, p);
            }

            do {
                System.out.println("Are there more conversions you would like to perform? Type yes to continue and no to end...");
                cont = input.next();
            } while ((!cont.equalsIgnoreCase("yes")) && (!cont.equalsIgnoreCase("no")));
        }

    }

    /**
     * Method that converts USD to currency of choice
     *
     * @param dollars amount of USD user wants converted
     * @param conversionChoice currency user wants USD converted to
     * @return converted amount of currency from USD
     */
    public static double convert4me(double dollars, double conversionChoice) {
        if (dollars > 100) {
            return (dollars * 0.95 * conversionChoice);
        } else {
            return (dollars * 0.90 * conversionChoice);
        }

    }
}
