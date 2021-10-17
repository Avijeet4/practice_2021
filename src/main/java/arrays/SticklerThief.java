package arrays;

public class SticklerThief {
    public static int findMaxSum(int arr[], int n)
    {

        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0], arr[1]);
        }
        // int dp[]=new int[n];

        int val2=arr[0];
        int val1=Math.max(arr[0], arr[1]);
        for(int i=2;i<n;i++){

            int maxVal=Math.max(val2+arr[i], val1);
            val2=val1;
            val1=maxVal;

        }
        return val1;
    }

    public static void main(String[] args) {
        System.out.println(findMaxSum(new int[]{5,5,10,100,10,5}, 6));
    }
}
