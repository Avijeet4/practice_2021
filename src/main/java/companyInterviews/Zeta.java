package companyInterviews;

public class Zeta {

    static int maxK(int arr[], int n, int k){
        if(n<k)
            k=n;
        int maxSum=0, sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=sum;
        for(int i=1;i<=k;i++){
            sum-=arr[k-i];
            sum+=arr[n-i];
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int n=4;
        int K=4;
//        int [][][]dp= new int[n][n][K+1];
//        for(int i=0;i<n;i++)
//            for(int j=0;j<n;j++)
//                for(int k=0;k<=K;k++)
//                    dp[i][j][k]=-1;
        System.out.println(maxK(new int[]{1,4,-2,3}, n, K));
    }
}
