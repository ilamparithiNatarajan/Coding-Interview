package samples;

public class DNASequence {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int[] solution(String S, int[] P, int[] Q) {
            char[] str = S.toCharArray();
            int[] replaced = new int[str.length];
            int[] least = new int[P.length];

            for (int i = 0; i < str.length; i++) {
                switch (str[i]) {
                    case ('A'):
                        replaced[i] = 1;
                        break;
                    case ('C'):
                        replaced[i] = 2;
                        break;
                    case ('G'):
                        replaced[i] = 3;
                        break;
                    case ('T'):
                        replaced[i] = 4;
                        break;
                }
            }

            int temp;
            for (int i = 0; i < P.length; i++) {
                temp = 0;
                for (int j = 0; j < Q[i] - P[i]; j++) {
                    if (temp == 0) {
                        temp = replaced[(P[i])] < replaced[(P[i] + 1)] ? replaced[(P[i])] : replaced[(P[i] + 1)];
                    }

                    temp = temp < replaced[(P[i] + 1)] ? temp : replaced[(P[i] + 1)];

                }
                temp = temp == 0 ? replaced[(P[i])] : temp;
                least[i] = temp;
            }
            return least;
        }
    }
}
