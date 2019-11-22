package samples;

public class ArrayInversionCountByBruteForce {
    public static void main(String[] args) {

    }

// this solution has performance issues
    static int solution(int[] A) {
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    num++;
                }
            }
        }
        return num > 1000000000 ? -1 : num;
    }
}
