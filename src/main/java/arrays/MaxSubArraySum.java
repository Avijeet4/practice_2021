package arrays;

public class MaxSubArraySum {
    static long maxSubArraySum(int arr[]){

        // Your code here
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int x:arr){
            sum+=x;
            if(sum<0){
                sum=0;
            }
            if(sum>0)
                max=Math.max(sum, max);
            max=Math.max(max,x);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{1, 2, 3, -2, 5}));
        System.out.println(maxSubArraySum(new int[]{-1,-2,-3,-4}));
    }
}
