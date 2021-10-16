package arrays;

public class MaxCircularSubArraySum {
    static int circularSubArraySum(int a[]) {

        // Your code here
        return Integer.max(kadane(a), reverseKadane(a));
    }

    static int kadane(int a[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int x:a){
            sum=Math.max(x, sum+x);
            max=Math.max(max,sum);
        }
        return max;
    }
    static int reverseKadane(int a[]){
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
            a[i]=-a[i];
        }

        int maxNegativeSum=kadane(a);
        if(total==-maxNegativeSum)
            return total;
        else
            return total+maxNegativeSum;
    }

    public static void main(String[] args) {
        System.out.println(circularSubArraySum(new int[]{8,-8,9,-9,10,-11,12}));
        System.out.println(circularSubArraySum(new int[]{10,-3,-4,7,6,5,-4,-1}));
    }
}
