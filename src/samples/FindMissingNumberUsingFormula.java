package samples;

import java.util.Arrays;

public class FindMissingNumberUsingFormula {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }


    public static int solution(int[] A) {
        int actual = 0;
        Arrays.sort(A);
        for (int i : A) {
            actual += i;
        }
        int len = A.length;
        int expected = (len + 1) * (len + 2) / 2;
        return A[0] != 0 ? 0 : expected - actual;
    }
}
