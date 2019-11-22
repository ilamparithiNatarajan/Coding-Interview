package samples;

import java.util.Arrays;

public class Distinctu {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1}));
    }


    public static int solution(int[] A) {
        int counter = A.length;
        if (counter == 0 || counter == 1) {
            return counter;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] == 0) {
                counter--;
                if (i == A.length - 1) {
                    counter--;
                }
            }
        }
        return counter;
    }
}

//100%