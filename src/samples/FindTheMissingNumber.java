package samples;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 5};
        int length = A.length;
        int start = 0;
        int end = length;
//        int sum = (length+1)*(length+2)/2;
        int missing = 0;

        for (int i = 0; i < length; i++) {
            int middle = (start + end) / 2;
            if ((A[middle] - A[middle - 1]) == 1) {
                start = middle + 1;
            } else {
                missing = middle;
            }
        }
        System.out.println("missing is : " + missing);
    }
}
