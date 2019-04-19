package AWS;

public class Excercise {
    public static void main(String[] args) {
        System.out.println("expected: 123698745  and actual :" + spiral(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println("expected: 123498745  and actual :" + spiral(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));

    }

    static String spiral(int[][] matrix) {

        /*  123
            456
            789
         */
        String print = "";
        int leftToRight = 0;
        int upToDown = matrix[0].length;
        int endingColumnIndex = matrix[0].length;
        int endingRowIndex = matrix.length;

        while (leftToRight < endingColumnIndex && upToDown < endingRowIndex) {

            for (int i = leftToRight; i < endingColumnIndex; i++) {
                print = print.concat(Integer.toString(matrix[leftToRight][i]));
            }
            leftToRight++;

            for (int i = upToDown; i < endingRowIndex; i++) {
                print = print.concat(Integer.toString(matrix[i][endingRowIndex - 1]));
            }
            endingRowIndex--;

            for (int i = endingColumnIndex - 1; i >= leftToRight; --i) {
                print = print.concat(Integer.toString(matrix[endingRowIndex - 1][i]));
            }
            endingColumnIndex--;

            for (int i = endingRowIndex - 1; i >= upToDown; --i) {
                print = print.concat(Integer.toString(matrix[i][upToDown]));
            }
            upToDown++;

        }

        return print;
    }
}
