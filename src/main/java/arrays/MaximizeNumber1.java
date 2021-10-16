package arrays;

public class MaximizeNumber1 {
    static int findZeroes(int arr[], int n, int m) {
        // code here
        int start=0;
        int end=0;
        int maxCnt=0;

        while(end<n){
            if(arr[end]==0){
                if(m>0){
                    m--;
                }else{
                    while(arr[start]!=0){
                        start++;
                    }
                    start++;
                }
            }
            maxCnt=Math.max(maxCnt, end-start+1);
            end++;
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        System.out.println(findZeroes(new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}, 11, 2));
    }

}
