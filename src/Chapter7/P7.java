package Chapter7;

import java.util.Scanner;

/**
 * Program that accepts list of numbers from user and takes first number as
 * length of list and calculates the average of the list
 *
 * @author makaylaroberts
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will be read: ");
        int n1 = input.nextInt();
        int[] numbers = new int[n1];

        enterNumbers(numbers, n1, input);
        double output = averageNum(numbers, n1);

        System.out.println("The average is " + output);

        printOut(numbers, n1);
    }

    /**
     * Method that converts USD to currency of choice
     *
     * @param numbers list of numbers
     * @param n1 amount of numbers in list
     * @param input Scanner
     */
    public static void enterNumbers(int[] numbers, int n1, Scanner input) {
        System.out.println("Enter " + n1 + " elements...");
        for (int i = 0; i < n1; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * Method that converts USD to currency of choice
     *
     * @param numbers list of numbers
     * @param n1 amount of numbers in list
     * @return total of all numbers in list
     */
    public static double averageNum(int[] numbers, int n1) {
        int total = 0;
        for (int i = 0; i < n1; i++) {
            total = total + numbers[i];
        }

        return total / n1;
    }

    /**
     * Method that converts USD to currency of choice
     *
     * @param numbers list of numbers
     * @param n1 amount of numbers in list
     */
    public static void printOut(int[] numbers, int n1) {
        System.out.println("The contents of the array: ");
        System.out.print("[");
        for (int i = 0; i < (n1 - 1); i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[n1 - 1]);
        System.out.print("]");
        System.out.println("");
    }
}
