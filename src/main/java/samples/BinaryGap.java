package samples;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(247));
    }


    public static int solution(int N) {
        String str = Integer.toBinaryString(N);
        char[] chars = str.toCharArray();
        int maxSoFar = 0;
        boolean started = false;
        int temp = 0;
        for (char s : chars) {
            if (s == '0') {
                if (started) {
                    temp++;
                }
            } else {
                if (started) {
                    maxSoFar = Math.max(maxSoFar, temp);
                    temp = 0;
                } else {
                    started = true;
                }
            }
        }
        return maxSoFar;
    }
}
