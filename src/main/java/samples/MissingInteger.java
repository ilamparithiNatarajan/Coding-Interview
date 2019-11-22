package samples;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    public static int solution(int[] A) {
        int missingNumber = 1;
        Arrays.sort(A);
        for (int i : A) {
            if (i == missingNumber) {
                missingNumber++;
            }
        }
        return missingNumber;
    }
}
