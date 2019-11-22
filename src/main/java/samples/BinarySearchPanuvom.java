package samples;

import java.util.Arrays;

public class BinarySearchPanuvom {
    public static void main(String[] args) {
        System.out.println(pineary(new int[]{2, 3, 5, 2, 6, 8, 12, 14, 78, 34, 78}, 2));
        System.out.println(pineary(new int[]{2}, 2));
        System.out.println(pineary(new int[]{2, 3}, 2));
        System.out.println(pineary(new int[]{2, 3}, 3));
    }

    private static int pineary(int[] A, int num) {
        Arrays.sort(A);
        System.out.println("sorted array :" + Arrays.toString(A) + " find this num : " + num);
        int n = A.length - 1;
        while (A[n] != num && n <= A.length - 1) {
            if (A[n] > num) {
                n = n / 2;
            } else {
                n = n + (A.length - 1 - n) / 2;
            }
        }
        while (n != 0 && A[n] == A[n - 1]) {
            n--;
        }
        return n;
    }

    private static int[] search(int[] A) {

        return A;
    }
}
