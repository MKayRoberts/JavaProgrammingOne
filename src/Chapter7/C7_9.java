package Chapter7;

import java.util.Scanner;

/**
 * Program accepts 10 numbers and prints out the lowest number
 *
 * @author makaylaroberts
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        min(array);

    }

    /**
     * Method that finds lowest number of array and prints out result
     *
     * @param array is array of numbers being tested for minimum
     */
    public static void min(double[] array) {
        double low = 1000000000;
        for (int i = 0; i < 10; ++i) {
            if (array[i] < low) {
                low = array[i];
            }
        }
        System.out.println("The minimum number is " + low);
    }
}
