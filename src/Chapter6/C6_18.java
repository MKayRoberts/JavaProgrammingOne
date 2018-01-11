package Chapter6;

import java.util.Scanner;

/**
 * Program accepts input as string and declares in string is a valid or invalid
 * password based on set criteria.
 *
 * @author makaylaroberts
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput, a, b, c;
        System.out.println("Enter password: ");
        userInput = input.nextLine();
        System.out.println();

        a = CharCheck(userInput);
        b = digitCheck(userInput);
        c = containsCheck(userInput);

        if (a.equals("true")) {
            if (b.equals("true")) {
                if (c.equals("true")) {
                    System.out.println("Valid password");
                } else {
                    System.out.println("Invalid Password");
                    System.out.println("A password must consist of only letters and digits");
                }

            } else {
                System.out.println("Invalid Password");
                System.out.println("A password must contain at least two digits");
            }

        } else {
            System.out.println("Invalid Password");
            System.out.println("A password must have at least eight characters");
        }
    }

    public static String CharCheck(String userInput) {
        int charAmount;
        charAmount = userInput.length();

        if (charAmount >= 8) {
            return "true";
        }
        return "false";
    }

    public static String digitCheck(String userInput) {
        int digitCount = 0;
        for (int i = 0, len = userInput.length(); i < len; i++) {
            if (Character.isDigit(userInput.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            return "true";
        }
        return "false";
    }

    public static String containsCheck(String userInput) {
        if (userInput.contains("#")) {
            return "false";
        }
        return "true";
    }
}
