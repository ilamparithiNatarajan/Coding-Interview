package samples;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int A = 11;
        int B = 7;
        int counter = 0;
        if (A == 0 || B == 0) {
            System.out.println(0);
            System.exit(0);
        }
        String s = Integer.toBinaryString(A * B);
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == '1') {
                counter++;
            }
        }
        System.out.println(s);
        System.out.println(Arrays.toString(array));
        System.out.println("number of 1s : " + counter);
    }
}
