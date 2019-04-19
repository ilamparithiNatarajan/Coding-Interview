package samples;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        validate("", "");
        validate("a", "a");
        validate("aa", "a2");
        validate("aaa", "a3");
        validate("ababab", "ababab");
        validate("aabcccccaaa", "a2b1c5a3");
        validate("abb", "ab2");
        validate("abbb", "ab3");
        validate("abbbb", "a1b4");
    }

    private static void validate(String str1, String str2) {

        System.out.println("input : " + str1);
        System.out.println("expected : " + str2);
        System.out.println("actual : " + compress(str1));

    }

    private static String compress(String str) {
        if (str.isEmpty() || str.length() == 1) return str;

        char[] array = str.toCharArray();
        Queue encoded = new LinkedList();
        Queue repetitions = new LinkedList();
        int temp = 1;
        boolean counter = false;

        for (int i = 0, jump; i < array.length; i = i + jump) {
            if (i < array.length - 1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        temp++;
                        if (!counter) counter = true;
                    } else break;
                }
            }
            jump = temp;
            encoded.add(array[i]);
            repetitions.add(temp);
            temp = 1;

        }
        if (encoded.size() == str.length() || !counter) return str;
        String result = "";
        while (encoded.size() > 0) {
            result = result.concat(Character.toString((char) encoded.poll())).concat(Integer.toString((int) repetitions.poll()));
        }
        return result;
    }
}
