package samples;

public class MinAbsDiffTwoSubArrays {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }

    static int solution(int A[]) {
        int sum = 0;
        int minSoFar = 1000;
        int tot = 0;
        for (int i : A) {
            sum += i;
        }
        for (int i : A) {
            tot += i;
            minSoFar = Math.min(minSoFar, Math.abs(tot - (sum - tot)));
        }
        return minSoFar;
    }
}
