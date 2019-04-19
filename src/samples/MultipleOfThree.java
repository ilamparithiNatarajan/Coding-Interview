package samples;

import java.util.Arrays;

public class MultipleOfThree {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            int len = A.length;
            return A[len - 1] * A[len - 2] * A[len - 3];
        }
    }
}
