package samples;

import java.util.*;

public class QuerySemiPrimesBySieve {
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

        Map<Integer, Integer> semiPrimes = new HashMap<Integer, Integer>();
        boolean[] sieve = new boolean[N + 1];
        Arrays.fill(sieve, true);
        composite(sieve);

        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }

        boolean[] semiPrimeArray = new boolean[N + 1];
        long temp;
        for (int i = 0; i < primes.size(); i++) {
            for (Integer prime : primes) {
                temp = (long) primes.get(i) * (long) prime;
                if (temp > N) {
                    break;
                }
                semiPrimeArray[(int) temp] = true;
            }
        }

        int semiPrimeCount = 0;
        for (int i = 1; i <= N; i++) {
            if (semiPrimeArray[i]) {
                semiPrimeCount++;
            }
            semiPrimes.put(i, semiPrimeCount);
        }
        return semiPrimes;
    }

    private static void composite(boolean[] primes) {

        int len = primes.length;
        int i = 2;
        primes[0] = primes[1] = false;
        while (i * i < len) {
            if (primes[i]) {
                int k = i * i;
                while (k <= len - 1) {
                    primes[k] = false;
                    k += i;
                }
            }
            i++;
        }
    }
}
