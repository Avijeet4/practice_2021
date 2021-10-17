package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateAndDelete {
    public static int rotateDelete(ArrayList<Integer> ar, int n){

        // Your code here
        int i=0;

        while((n=ar.size())>1){

            ar.add(0,ar.get(n-1));
            ar.remove(n);

            ar.remove(n-i-1<0?0:n-i-1);
            i++;
        }
        return ar.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(rotateDelete(ar, ar.size()));
    }
}
