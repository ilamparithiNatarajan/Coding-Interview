package samples;

public class FrogJumps {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public int solution(int X, int[] A) {
        boolean[] leaves = new boolean[X + 1];
        for (int i = 0; i < A.length; i++) {
            if (!leaves[A[i]]) {
                leaves[A[i]] = true;
                X--;
            }
            if (X == 0) {
                return i;
            }
        }
        return -1;
    }
}
