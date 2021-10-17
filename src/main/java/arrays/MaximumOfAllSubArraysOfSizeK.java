package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumOfAllSubArraysOfSizeK {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        for(;i<k;i++){
            queue.add(arr[i]);
        }
        res.add(queue.peek());
        queue.remove(arr[0]);

        for(;i<n;i++){
            queue.add(arr[i]);
            res.add(queue.peek());
            queue.remove(arr[i-k+1]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(max_of_subarrays(new int[]{1,2,3,1,4,5,2,3,6}, 9,3));
    }
}
