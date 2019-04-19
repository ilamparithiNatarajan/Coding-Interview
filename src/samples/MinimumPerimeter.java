package samples;

public class MinimumPerimeter {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int N) {
            int root = (int) Math.floor(Math.sqrt(N));
            int maxSoFar = 4 * N;
            for (int i = 1; i <= root; i++) {
                if (N % i == 0) {
                    maxSoFar = Math.min(maxSoFar, i + (N / i));
                }
            }
            return 2 * maxSoFar;
        }
    }
}
