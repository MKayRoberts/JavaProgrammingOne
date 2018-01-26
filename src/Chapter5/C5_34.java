package Chapter5;

import java.util.Scanner;

/**
 * Program plays rock paper scissors against user until either computer or user
 * has won more than two times.
 *
 * @author makaylaroberts
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comWin = 0, plaWin = 0, comGen, plaGen;

        while (((comWin < 3)) && (plaWin < 3)) {
            System.out.println("Scissor (0), rock (1), paper (2) : ");
            plaGen = input.nextInt();
            comGen = (int) (Math.random() * 3);

            if (comWin > 2) {
                System.out.println("*************************************");
                System.out.println("The computer won more than two times.");
                System.out.println("*************************************");
                return;
            }
            if (plaWin > 2) {
                System.out.println("*************************************");
                System.out.println("You won more than two times. Congratulations!");
                System.out.println("*************************************");
                return;
            }

            if (comGen == 0) {
                if (plaGen == 1) {
                    ++plaWin;
                    System.out.println("Computer is scissor. You are rock. You won this round.");
                }
                if (plaGen == 2) {
                    ++comWin;
                    System.out.println("Computer is scissor. You are paper. Computer won this round.");
                }
                if (plaGen == 0) {
                    System.out.println("The computer is scissors. You are scissors. It is a draw.");
                }
            } else if (comGen == 1) {
                if (plaGen == 0) {
                    ++comWin;
                    System.out.println("Computer is rock. You are scissors. Computer wins this round.");
                } else if (plaGen == 1) {
                    System.out.println("Computer is rock. You are rock. It is a draw.");
                } else if (plaGen == 2) {
                    ++plaWin;
                    System.out.println("Computer is rock. You are paper. You won this round.");
                }
            } else if (comGen == 2) {
                if (plaGen == 0) {
                    ++plaWin;
                    System.out.println("Computer is paper. You are scissors. You won this round.");
                }
                if (plaGen == 1) {
                    ++comWin;
                    System.out.println("Computer is paper. You are rock. Computer wins this round.");
                }
                if (plaGen == 2) {
                    System.out.println("Computer is paper. You are paper. It is a draw.");
                }
            }
        }
    }
}
