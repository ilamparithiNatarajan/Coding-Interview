package samples;

public class ExcelColumnToNumber {
    public static void main(String[] args) {
        System.out.println(find("ABB"));
    }

    static int find(String column) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] columnCharArray = column.toCharArray();
        int sum = new String(alphabet).indexOf(columnCharArray[columnCharArray.length - 1]) + 1;
        for (int i = columnCharArray.length - 2; i >= 0; i--) {
            sum = sum + ((new String(alphabet).indexOf(columnCharArray[i]) + 1) * (int) (Math.pow(26, columnCharArray.length - i - 1)));
        }

        return sum;
    }
}
