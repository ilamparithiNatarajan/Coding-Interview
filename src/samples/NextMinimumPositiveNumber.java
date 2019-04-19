package samples;

import java.util.Arrays;

public class NextMinimumPositiveNumber {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {
            int missing = 1;
            int timer = 1;
            int[] pos = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    pos[i] = A[i];
                }
            }
            Arrays.sort(pos);

            if (pos[0] == 1) {
                for (int i = 0; i < pos.length - 1; i++) {
                    if ((pos[i + 1] - pos[i]) == 1) {
                        timer++;
                    } else if (pos[i + 1] - pos[i] > 1) {
                        return pos[i] + 1;
                    }
                }
            } else {
                return 1;
            }
            int size = pos.length;
            return pos[size - 1] + 1;
        }
    }
}
