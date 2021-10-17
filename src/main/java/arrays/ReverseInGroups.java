package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInGroups {
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int max=0;
        for(int num:arr){
            max=Math.max(num,max);
        }
        max++;
        int ind=0;
        while(ind<n){
            int end=Math.min(ind+k,n)-1;
            int start=0;
            while(ind+start<=end){
//                System.out.println((arr.get(end-start)%max)*max + arr.get(start));
                arr.set(ind+start,  (arr.get(end-start) %max)*max + arr.get(ind+start));
                start++;
            }
            ind+=start;
        }
        for(int i=0;i<n;i++){
            arr.set(i,arr.get(i)/max);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseInGroups(arr, 5, 3);
        System.out.println(arr);
    }
}
