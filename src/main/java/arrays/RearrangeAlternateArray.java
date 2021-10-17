package arrays;
//Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
//
//Example 1:
//
//Input:
//N = 6
//arr[] = {1,2,3,4,5,6}
//Output: 6 1 5 2 4 3
//Explanation: Max element = 6, min = 1,
//second max = 5, second min = 2, and
//so on... Modified array is : 6 1 5 2 4 3.
public class RearrangeAlternateArray {
    public static void rearrange(int arr[], int n){
        int bigNum=arr[n-1]+1;
        int j=n-1;
        int i=0;
        int k=0;
        while(k<n){
            if(k%2==0){
                arr[k]=(arr[j]%bigNum)*bigNum+arr[k];
                j--;
            }else{
                arr[k]=(arr[i]%bigNum)*bigNum+arr[k];
                i++;
            }
            k++;
        }
        k=0;
        while(k<n){
            arr[k]/=bigNum;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rearrange(arr, 6);
        for(int n:arr)
            System.out.print(n+" ");
    }
}
