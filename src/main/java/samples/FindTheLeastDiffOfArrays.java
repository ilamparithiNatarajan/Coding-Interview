package samples;

import java.util.Arrays;

public class FindTheLeastDiffOfArrays {
    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 2, 4, 3};
        int diff = 0;
        int[] arrA;
        int[] arrB;
        int sumA = 0;
        int sumB = 0;
        int temp = 0;
        for (int i = 1; i < A.length; i++) {
            sumA = 0;
            sumB = 0;
            int j = 0;
            while (j < i) {
                sumA += A[j];
                j++;
            }
            while (j < A.length) {
                sumB += A[j];
                j++;
            }

            temp = Math.abs(sumB - sumA);
            System.out.println("temp temp is : " + temp);
            diff = (diff == 0) ? temp : temp > diff ? diff : temp;
            System.out.println("temp diff is : " + diff);
        }
        System.out.println("diff is : " + diff);
    }
}
