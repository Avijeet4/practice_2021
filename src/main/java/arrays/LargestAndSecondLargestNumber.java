package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestAndSecondLargestNumber {
    public static ArrayList<Integer> largestAndSecondLargest(int arr[])
    {
        //code here.
        int max1=-1, max2=-1;
        for(int n:arr){
            if(max1<n){
                max2=max1;
                max1=n;
            }else if(n!=max1 && max2<n){
                max2=n;
            }
        }
        return new ArrayList<>(Arrays.asList(max1, max2));
    }

    public static void main(String[] args) {
        System.out.println(largestAndSecondLargest(new int[]{1,2,3,4,5}));
    }
}
