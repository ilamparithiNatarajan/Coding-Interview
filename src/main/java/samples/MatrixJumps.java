package samples;

public class MatrixJumps {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        System.out.println(jump(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}));
    }

    static int jump(int[] array) {
        int len = array.length;
        int i = 0;
        int temp = 0;
        while (i < len - 1) {
            i = i + array[i];
            temp++;
        }

        return temp;
    }
}
