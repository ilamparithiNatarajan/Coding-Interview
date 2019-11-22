package samples;

import java.time.Instant;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class HashTablesu {
    public static void main(String[] args) {
        Map<Integer, Integer> table = new Hashtable<>();
        int[] keyArray = new int[500];
        for (int i = 0; i < 500; i++) {
            int randomKey = new Random().nextInt(5000);
            int randomValue = new Random().nextInt(5000);
            keyArray[i] = randomKey;
            table.put(randomKey, randomValue);
        }
        for (int i = 499; i > 0; i--) {
            int then = Instant.now().getNano();
            table.get(keyArray[i]);
            int now = Instant.now().getNano();
            System.out.println(now - then);
        }
    }
}
