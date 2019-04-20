package samples;


public class ExcelColumnFinder {
    public static void main(String[] args) {
        // System.out.println(find(25));
        System.out.println(find(730));
    }

    static String find(int num) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String result = "";
        int temp = 1;
        while (num > 0) {
            int mod = num % (int) (Math.pow(26, temp));
            int index = (mod / (int) Math.pow(26, temp - 1)) - 1;
            result = Character.toString(alphabet[index]).concat(result);
            num = num - mod;
            temp++;
        }

        return result;
    }
}
