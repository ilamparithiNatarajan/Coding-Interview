package samples;

public class Caterpillar {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7};
        int num = 12;
        int end = 0;
        int sum = 0;
        for (int start = 0; start < A.length; start++) {
            while (end < A.length && A[end] + sum <= num) {
                sum += A[end];
                end++;

            }
            if (sum == num) {
                System.out.println(true);
//                System.exit(0);
            }
            sum -= A[start];

        }
        System.out.println(false);

    }
}
