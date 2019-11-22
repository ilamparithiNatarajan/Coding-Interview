package samples;

import java.util.Arrays;

public class OddOccurencesInArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }


    public static int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        for (int i = 0; i < len - 1; i = i + 2) {
            if (A[i + 1] - A[i] > 0) {
                return A[i];
            }
        }
        return A[len - 1];
    }
}
