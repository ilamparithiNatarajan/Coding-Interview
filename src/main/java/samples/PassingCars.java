package samples;

public class PassingCars {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }


    public static int solution(int[] A) {
        long result = 0;
        int multiplier = 0;
        boolean started = false;
        for (int i : A) {
            if (i == 0) {
                if (started) {
                    multiplier++;
                } else {
                    started = true;
                    multiplier++;
                }
            } else {
                if (started) {
                    result += multiplier;
                }
            }
        }
        return (int) result > 1000000000 ? -1 : (int) result;
    }
}
