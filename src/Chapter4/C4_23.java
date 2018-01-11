package Chapter4;

import java.util.Scanner;

/**
 * Program accepts payroll info from user before displaying payroll info to
 * user, including deductions, net pay and gross pay.
 *
 * @author makaylaroberts
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double hours, payRate, fedWith, staWith, perFed, perSta, money, deductFed, deductSta, deductTot, finMoney;

        System.out.println("Enter employee name: ");
        name = input.nextLine();

        System.out.println("Enter number of hours worked: ");
        hours = input.nextDouble();

        System.out.println("Enter pay rate: ");
        payRate = input.nextDouble();

        System.out.println("Enter federal withholding rate: ");
        fedWith = input.nextDouble();
        perFed = fedWith * 100;

        System.out.println("Enter state withholding rate: ");
        staWith = input.nextDouble();
        perSta = staWith * 100;
        System.out.println("");
        System.out.println("");
        System.out.println("");

        money = hours * payRate;
        deductFed = (money * fedWith);
        deductSta = (money * staWith);
        deductTot = (deductFed + deductSta);
        finMoney = money - deductTot;

        System.out.print("Employee Name: " + name);
        System.out.println("");
        System.out.printf("Hours Worked: " + hours);
        System.out.println("");
        System.out.printf("Pay Rate: $%4.2f", payRate);
        System.out.println("");
        System.out.printf("Gross Pay: $%4.2f", money);
        System.out.println("");
        System.out.println("Deductions: ");
        System.out.printf("    Federal Withholding (" + perFed + "%%): $%4.2f", deductFed);
        System.out.println("");
        System.out.printf("    State Withholding (" + perSta + "%%): $%4.2f", deductSta);
        System.out.println("");
        System.out.printf("    Total Deduction: $%4.2f", deductTot);
        System.out.println("");
        System.out.printf("Net Pay: $%4.2f", finMoney);
        System.out.println("");
    }
}
