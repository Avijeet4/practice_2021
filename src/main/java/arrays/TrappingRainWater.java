package arrays;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        // Your code here
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        long sum=0;
        leftMax[0]=arr[0];
        rightMax[n-1]=arr[n-1];
        for(int i=1,j=n-2;i<n;i++,j--){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
            rightMax[j]=Math.max(arr[j],rightMax[j+1]);
        }

        for(int i=0;i<n;i++){
            sum+=Math.min(leftMax[i], rightMax[i])-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{3,0,0,2,0,4},6));
    }
}
