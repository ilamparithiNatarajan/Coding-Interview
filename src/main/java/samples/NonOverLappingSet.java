package samples;

public class NonOverLappingSet {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 7, 9, 9}, new int[] {5, 6, 8, 9, 10}));
    }
    public static int solution(int[] A, int[] B) {
        if(A.length == 0) return 0;
        if(A.length == 1) return 1;
        int temp = 0;
        int end = B[0];
        for(int i = 0; i < A.length-1; i++){
            if(end < A[i+1]){
                temp++;
                end = B[i+1];
            }
        }
        return temp;
    }
}
