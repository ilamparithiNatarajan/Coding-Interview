package samples;

import java.util.*;

public class QuerySemiPrimesByBruteForce {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20})));
    }

    public static int[] solution(int N, int[] P, int[] Q) {
        int[] range = new int[P.length];
        Map<Integer, Integer> semiPrimes = getSemiPrimes(N);
        for (int i = 0; i < P.length; i++) {
            if (i == 0 || P[i] == 1) {
                range[i] = semiPrimes.get(Q[i]) - semiPrimes.get(P[i]);
            } else {
                range[i] = semiPrimes.get(Q[i]) - semiPrimes.get(P[i] - 1);
            }
        }
        return range;
    }

    private static Map<Integer, Integer> getSemiPrimes(int N) {
        int semiPrimeCount = 0;
        Map<Integer, Integer> semiPrimes = new HashMap<Integer, Integer>();
        Set<Integer> primes = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if (isSemiPrime(i, primes)) {
                semiPrimeCount++;
            }
            semiPrimes.put(i, semiPrimeCount);
        }
        return semiPrimes;
    }

    private static boolean isSemiPrime(int n, Set<Integer> primes) {
        if (n <= 3) return false;
        boolean isSemiPrime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && (primes.contains(i) || isPrime(i, primes)) && (primes.contains(i) || isPrime(n / i, primes))) {
                isSemiPrime = true;
            } else if (n % i == 0 && !(primes.contains(i) || isPrime(i, primes))) {
                return false;
            }
        }
        return isSemiPrime;
    }

    private static boolean isPrime(int n, Set<Integer> primes) {
        if (n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        primes.add(n);
        return true;
    }
}
