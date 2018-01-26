package Chapter2;

import java.util.Scanner;

/**
 * Program to accept input of radius and length before calculating and
 * displaying area and volume
 *
 * @author makaylaroberts
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, length;

        System.out.println("Enter radius...");
        radius = input.nextDouble(); // recieves radius
        System.out.println("Enter length...");
        length = input.nextDouble(); // recieves length

        double area = radius * radius * 3.14;
        double volume = area * length;

        System.out.println("Your area is " + area);
        System.out.println("Your volume is " + volume);
    }
}
