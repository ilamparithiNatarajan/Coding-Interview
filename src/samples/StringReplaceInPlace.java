package samples;

public class StringReplaceInPlace {
    public static void main(String[] args) {
        System.out.println("reversed array : " + reverse("find you will pain only go you recordings security the into if"));
    }

    private static String reverse(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            arr = swap(arr, i, len - i - 1);
        }

        return new String(arr);
    }

    private static char[] swap(char[] arr, int a, int b) {
        char c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        return arr;
    }
}
