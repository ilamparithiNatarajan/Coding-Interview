package samples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class VoraciousFish {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A, int[] B) {
            Stack<Integer> downstream = new Stack();
            int alive = A.length;
            for (int i = 0; i < A.length; i++) {
                if (B[i] == 1) {
                    downstream.push(A[i]);
                } else {
                    while (!downstream.isEmpty()) {
                        if (downstream.peek() > A[i]) {
                            alive--;
                            break;
                        } else {
                            alive--;
                            downstream.pop();
                        }
                    }
                }
            }


            return alive;
        }

    }
}
