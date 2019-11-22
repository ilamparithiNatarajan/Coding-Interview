package samples;

public class Formattt {
    public static void main(String[] args) {
        final String FORMAT = "%s: Code: %s Description: %s";
        System.out.println(String.format(FORMAT, "abc", "def", "ghi"));
    }
}
