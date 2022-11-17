package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimizeArrayCost {
    public static long method1(List<Integer> arr){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.addAll(arr);
        int n=arr.size();
        int max=-1;
        int maxI=0;
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr.get(i+1)-arr.get(i))>max){
                max=Math.abs(arr.get(i+1)-arr.get(i));
                maxI = i;
            }
        }
        int newVal=arr.get(maxI)>arr.get(maxI+1)?arr.get(maxI)-max/2:arr.get(maxI)+max/2;
        arr.add(maxI+1, newVal);
        long minCost=0;
        for(int i=0;i<n;i++){
            minCost+=Math.pow(arr.get(i+1)-arr.get(i), 2);
        }
        return minCost;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,3,5,2,10));
        System.out.println(method1(list));
    }
}
