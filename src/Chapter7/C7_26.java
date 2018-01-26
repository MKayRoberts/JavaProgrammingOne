package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program accepts two lists and compares them to see if they are identical or
 * not
 *
 * @author makaylaroberts
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list 1's integers...");
        int n1 = input.nextInt();
        int[] List1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            List1[i] = input.nextInt();
        }

        System.out.println("Enter list 2's integers...");
        int n2 = input.nextInt();
        int[] List2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            List2[i] = input.nextInt();
        }

        boolean result = identical(List1, List2);

        if (result == true) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are NOT strictly identical");
        }
    }

    /**
     * Method checks if two lists are identical
     *
     * @param List1 provides list 1
     * @param List2 provides list 2
     * @return if two lists are identical
     */
    public static boolean identical(int[] List1, int[] List2) {
        if (Arrays.equals(List1, List2)) {
            return true;
        } else {
            return false;
        }
    }
}
