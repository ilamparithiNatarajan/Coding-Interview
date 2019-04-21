package samples;

import java.util.*;

//70% correctness on codility


public class MaxCleanPairSocks {
    public static void main(String[] args) {
        System.out.println(solution(2, new int[]{1, 2, 1, 1}, new int[]{1, 4, 3, 2, 4}));
    }

    private static int solution(int K, int[] C, int[] D) {
        int cleanPair = 0;
        Arrays.sort(C);
        Arrays.sort(D);
        int temp = 1;
        for (int i = 0; i < C.length; i++) {
            if (i < C.length - 1 && C[i] == C[i + 1]) {
                temp++;
            } else {
                cleanPair += temp / 2;
                if (temp % 2 != 0 && K != 0) {
                    for (int j = 0; j < D.length; j++) {
                        if (D[j] == C[i]) {
                            K--;
                            cleanPair++;
                            D[j] = 0;
                            break;
                        }
                    }
                }
                temp = 1;
            }
        }
        for (int i = 0; i < D.length - 1; i++) {
            if (K == 0) break;
            if (D[i] != 0 && D[i] == D[i + 1]) {
                K--;
                cleanPair++;
                i++;
            }
        }
        return cleanPair;
    }
}
