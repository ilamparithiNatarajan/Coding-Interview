package samples;

public class NumberOfDivisors {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int N) {
            int root = (int) Math.floor(Math.sqrt(N));
            int counter = 0;
            for (int i = 1; i <= root; i++) {
                if (N % i == 0) {
                    System.out.println("came here");
                    counter = counter + 2;
                    if (i * i == N) {
                        counter--;
                    }
                }
            }
            return counter;
        }
    }
}
