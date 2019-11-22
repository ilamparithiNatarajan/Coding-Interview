package samples;

import java.util.Arrays;

public class DistinctValues {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            int distinct = 1;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] != A[i]) {
                    distinct++;
                }
            }
            return distinct;

        }
    }
}
