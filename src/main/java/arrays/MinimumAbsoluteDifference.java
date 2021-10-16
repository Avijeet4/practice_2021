package arrays;

public class MinimumAbsoluteDifference {
    public static int minAdjDiff(int arr[], int n) {
        int minimumDiff=findAbsoluteDiff(arr[0],arr[n-1]);
        for(int i=0;i<arr.length-1;i++){
            minimumDiff=Math.min(findAbsoluteDiff(arr[i],arr[i+1]), minimumDiff);
        }
        return minimumDiff;
    }

    static int findAbsoluteDiff(int a, int b){
        return Math.max(a,b)-Math.min(a,b);
    }

    public static void main(String[] args) {
        System.out.println(minAdjDiff(new int[]{8,-8,9,-9,10,-11,12}, 7));
    }

}
