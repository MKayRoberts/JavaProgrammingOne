package Chapter2;

import java.util.Scanner;

/**
 * Program to receive price of meal and meal components before calculating and
 * displaying cost of food, tax, tip, and subtotal
 *
 * @author makaylaroberts
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of meal. Exclude dollar sign... $");
        double mealP = input.nextDouble();
        System.out.println("Enter price of drink. Exclude dollar sign... $");
        double drinkP = input.nextDouble();
        System.out.println("Enter price of dessert. Exclude dollar sign... $");
        double dessertP = input.nextDouble();

        double foodP = (mealP + drinkP + dessertP);
        double salesT = (foodP * 0.1);
        double foodP2 = (foodP + salesT);
        double tip = (foodP2 * 0.15);
        double complete = (foodP2 + tip);

        System.out.println("Cost of food was:" + foodP);
        System.out.println("Tax was:" + salesT);
        System.out.println("Tip was:" + tip);
        System.out.println("Total cost is:" + complete);
    }
}
