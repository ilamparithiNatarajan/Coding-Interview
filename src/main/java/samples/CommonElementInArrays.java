package samples;

public class CommonElementInArrays {
    public static void main(String[] args) {
        System.out.println(find(new int[][]{{1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9},
        }));
        System.out.println(find(new int[][]{
        }));
        System.out.println(find(new int[][]{{}, {1, 2, 3}
        }));
    }

    static int find(int[][] arrays) {
        if (arrays.length == 0 || arrays[0].length == 0) {
            return -1;
        }
        outer:
        for (int i = 0; i < arrays[0].length; i++) {
            for (int j = 1; j < arrays.length; j++) {
                if (arrays[j].length == 0) {
                    return -1;
                }
                for (int k = 0; k < arrays[j].length; k++) {
                    if (arrays[0][i] == arrays[j][k]) {
                        if (j == arrays.length - 1) {
                            return arrays[j][k];
                        }
                        break;
                    } else if (i == arrays[0].length - 1 && k == arrays[j].length - 1) {
                        return -1;
                    } else if (k == arrays[j].length - 1) {
                        continue outer;
                    }
                }
            }
        }
        return -1;
    }
}
