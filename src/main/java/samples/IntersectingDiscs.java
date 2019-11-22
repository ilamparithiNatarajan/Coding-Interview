package samples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class IntersectingDiscs {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        int[] a = new int[]{1, 5, 2, 1, 4, 0};
        int result = 0;
        int[] dps = new int[a.length];
        int[] dpe = new int[a.length];

        for (int i = 0, t = a.length - 1; i < a.length; i++) {
            int s = i > a[i] ? i - a[i] : 0;
            int e = t - i > a[i] ? i + a[i] : t;
            dps[s]++;
            dpe[e]++;
        }

        int t = 0;
        for (int i = 0; i < a.length; i++) {
            if (dps[i] > 0) {
                result += t * dps[i];
                result += dps[i] * (dps[i] - 1) / 2;
                if (10000000 < result) System.out.println(-1);
                ;
                t += dps[i];
            }
            t -= dpe[i];
        }

        System.out.println("counter : " + result);
        System.out.println(dtf.format(LocalDateTime.now()));
    }
}
