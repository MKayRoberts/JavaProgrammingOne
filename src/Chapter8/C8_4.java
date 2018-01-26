package Chapter8;

/**
 * Program that displays the hours worked per day by each employee and also the
 * total for the week for each employee
 *
 * @author makaylaroberts
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totals = new int[hours.length];
        for (int r = 0; r < hours.length; r++) {
            for (int c = 0; c < hours[r].length; c++) {
                totals[r] += hours[r][c];
            }
        }
        System.out.println("\t\tSu \tMon \tTue \tWed \tThu \tFri \tSa \tTotals");
        for (int r = 0; r < hours.length; r++) {
            System.out.print("Employee " + r);
            for (int c = 0; c < hours[r].length; c++) {
                System.out.print("\t" + hours[r][c]);
            }
            System.out.print("\t" + totals[r]);
            System.out.println();
        }
    }
}
