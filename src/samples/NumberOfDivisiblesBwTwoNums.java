package samples;

public class NumberOfDivisiblesBwTwoNums {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int A, int B, int K) {
            int b = B / K;
            int a = (A > 0 ? (A - 1) / K : 0);
            if (A == 0) {
                b++;
            }
            return b - a;
        }
    }
}
