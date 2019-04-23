package samples;

public class MaxChocolatesPossibleByLCM {
    public static void main(String[] args) {
        System.out.println(solution(10, 4));
    }

    public static int solution(int N, int M) {
        long lcm = N * M / gcd(N, M);
        return (int)lcm / M;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else return gcd(b, a % b);
    }
}
