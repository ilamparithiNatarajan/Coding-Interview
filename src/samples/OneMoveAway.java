package samples;

public class OneMoveAway {
    public static void main(String[] args) {
        System.out.println(isOneMoveAway("", ""));
        System.out.println(isOneMoveAway("", "a"));
        System.out.println(isOneMoveAway("b", "a"));
        System.out.println(isOneMoveAway("abccde", "abcde"));
        System.out.println(isOneMoveAway("abde", "abcde"));
        System.out.println(isOneMoveAway("abcd", "abed"));
        System.out.println(isOneMoveAway("abcd", "abde"));
        System.out.println(isOneMoveAway("abbcd", "abccd"));
        System.out.println(isOneMoveAway("abc", "cde"));
        System.out.println(isOneMoveAway("asdf", "abcd"));
        System.out.println(isOneMoveAway("abc", "bca"));

    }

    private static boolean isOneMoveAway(String str1, String str2) {
        int counter = 0;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (arr1[i] == arr2[i]) {
                counter++;
            } else {
                break;
            }
        }

        int incrementor = 0;
        if (arr1.length != arr2.length) {
            incrementor = 1;
        }
        char[] biggerArray = arr1.length > arr2.length ? arr1 : arr2;
        char[] smallerArray = arr1.length > arr2.length ? arr2 : arr1;

        for (int i = Math.min(str1.length(), str2.length()) - 1; i >= 0; i--) {
            if (biggerArray[i + incrementor] == smallerArray[i]) {
                counter++;
            } else {
                break;
            }
        }
        return counter >= Math.min(str1.length(), str2.length()) - 1;

    }
}
