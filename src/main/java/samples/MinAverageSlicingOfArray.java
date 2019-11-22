package samples;

public class MinAverageSlicingOfArray {

    class Solution {
        public int solution(int[] A) {
            double min_avg_value = (A[0] + A[1]) / 2.0;
            int min_avg_pos = 0;
            for (int index = 0; index < A.length - 2; index++) {
                if ((A[index] + A[index + 1]) / 2.0 < min_avg_value) {
                    min_avg_value = (A[index] + A[index + 1]) / 2.0;
                    min_avg_pos = index;
                }

                if ((A[index] + A[index + 1] + A[index + 2]) / 3.0 < min_avg_value) {
                    min_avg_value = (A[index] + A[index + 1] + A[index + 2]) / 3.0;
                    min_avg_pos = index;
                }

                // if ((A[-1]+A[-2])/2.0 < min_avg_value){
                // min_avg_value = (A[-1]+A[-2])/2.0;
                // min_avg_pos = A.length-2;
                // }
            }
            return min_avg_pos;


        }
    }
}
