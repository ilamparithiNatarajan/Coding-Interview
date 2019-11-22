package samples;

import java.util.Arrays;

public class MaxChocolatesPossibleByBruteForce {
    public static void main(String[] args) {
        System.out.println(solution(10, 4));
    }

    public static int solution(int N, int M) {
        int result = 0;
        boolean[] empty = new boolean[N];
        Arrays.fill(empty, false);
        for (int i = 0; !empty[i]; i = (i + M) % N) {
            if (i == 0) {
                empty[0] = true;
                result++;
                continue;
            }
            empty[i] = true;
            result++;
        }
        return result;
    }
}
