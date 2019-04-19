package samples;

public class RotateTheArray {
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 9, 7, 6};
        int K = 3;
        int temp = 0;

        if (K > 0 && array.length > 1) {
            while (temp < K) {
                array = rotate(array);
                temp++;
            }
        }

    }

    static int[] rotate(int[] array) {
        int[] arr = new int[array.length];
        int size = array.length;
        arr[0] = array[size - 1];
        for (int i = 0; i < array.length - 1; i++) {
            arr[i + 1] = array[i];
        }

        return arr;
    }
}
