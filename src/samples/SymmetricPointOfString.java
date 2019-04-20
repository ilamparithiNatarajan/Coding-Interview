package samples;

public class SymmetricPointOfString {
    public static void main(String[] args) {
        System.out.println(solution("malayalam"));
        System.out.println(solution(""));
        System.out.println(solution("x"));
    }

    public static int solution(String S) {
        int len = S.length();
        if (len % 2 == 0) {
            return -1;
        }
        int begin = 0, mid = len / 2, end = len - 1;
        while (begin < mid) {
            if(S.charAt(begin) != S.charAt(end)) {
                return -1;
            }
            begin ++;
            end --;

        }
        return mid;

    }
}
