package samples;

public class FloodDepth {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 9, 8, 7, 4, 8, 7, 10, 31, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 1, 2}));
    }

    private static int solution(int[] A) {
        int len = A.length;
        int leftMax = 0;
        int maxDepth = 0;
        int temp = 0;
        int minSoFar = 100000000;
        for (int i = 1; i < len; i++) {
            if (A[i] > A[i - 1]) {
                if (leftMax != 0 && A[i] > leftMax) {
                    if (temp != 0) {
                        maxDepth = Math.max(maxDepth, leftMax - minSoFar);
                        minSoFar = 100000000;
                    }
                    leftMax = A[i];
                    temp = 0;

                } else if (leftMax != 0) {
                    maxDepth = Math.max(maxDepth, A[i] - temp);
                }
            } else if (A[i] < A[i - 1]) {
                temp = A[i];
                minSoFar = Math.min(minSoFar, temp);
                leftMax = Math.max(leftMax, A[i - 1]);
            }
        }

        return maxDepth;
    }
}
