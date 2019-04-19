package samples;

import java.util.Arrays;

public class MaxCounter {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int[] solution(int N, int[] A) {
            int[] counter = new int[N];
            Arrays.fill(counter, 0);
            int max = 0;
            for (int i : A) {
                if (i == N + 1) {
                    Arrays.fill(counter, max);

                } else {
                    counter[i - 1]++;
                    if (counter[i - 1] > max) {
                        max = counter[i - 1];
                    }

                }
            }
            return counter;
        }
    }
}
