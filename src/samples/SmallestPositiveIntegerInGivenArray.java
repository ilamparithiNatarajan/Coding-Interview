package samples;

import java.util.Arrays;

public class SmallestPositiveIntegerInGivenArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 0, 1}));
        System.out.println(solution(new int[]{-1, 0, 2}));
        System.out.println(solution(new int[]{1, 0, 2}));
        System.out.println(solution(new int[]{3, 0, 2}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int firstPositiveNumber = 1;
        for(int i : A) {
            if(i < firstPositiveNumber) {
                continue;
            }
            if(i == firstPositiveNumber) {
                firstPositiveNumber++;
            }
            if(i > firstPositiveNumber) {
                return firstPositiveNumber;
            }
        }
        return firstPositiveNumber;
    }
}
