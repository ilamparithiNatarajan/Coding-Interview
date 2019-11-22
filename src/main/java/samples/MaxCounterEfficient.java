package samples;

import java.util.Arrays;

public class MaxCounterEfficient {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }

    static int[] solution(int N, int[] A) {
        int[] array = new int[N];
        int maxCounter = 0;
        int currentMax = 0;
        int lastUpdate = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (array[A[i] - 1] < lastUpdate) {
                    array[A[i] - 1] = lastUpdate + 1;
                } else {
                    array[A[i] - 1]++;
                }
                if (array[A[i] - 1] > currentMax) currentMax = array[A[i] - 1];
            } else {
                maxCounter = currentMax;
                lastUpdate = maxCounter;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxCounter) array[i] = maxCounter;
        }
        return array;
    }
}
