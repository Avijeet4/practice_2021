package arrays;

public class EquilibriumPoint {
    public static int equilibriumPoint(long A[], int n) {

        // Your code here
        long sumA[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
            sumA[i]=sum;
        }
        for(int i=0;i<n;i++){
            if(sumA[i]-A[i]==sumA[n-1]-sumA[i]){
                return (int)i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(equilibriumPoint(new long[]{1,3,5,2,2}, 5));
    }
}
