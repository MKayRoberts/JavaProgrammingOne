package Chapter7;

import java.util.Scanner;

/**
 * Program accepts number of students and the student #'s score before ranking
 * them on a curve
 *
 * @author makaylaroberts
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int studentNum = input.nextInt();
        int[] scores = new int[studentNum];
        System.out.println("Enter " + studentNum + " scores: ");
        for (int i = 0; i < studentNum; i++) {
            scores[i] = input.nextInt();
        }

        int best = 0;
        for (int i = 0; i < studentNum; ++i) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        String[] grades = new String[studentNum];

        for (int i = 0; i < studentNum; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = "A";
            } else if (scores[i] >= best - 20) {
                grades[i] = "B";
            } else if (scores[i] >= best - 30) {
                grades[i] = "C";
            } else if (scores[i] >= best - 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        for (int i = 0; i < studentNum; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}
