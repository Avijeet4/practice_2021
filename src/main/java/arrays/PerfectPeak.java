package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectPeak {
    public static int perfectPeak(List<Integer> A) {
        for(int i=0;i<A.size();i++){
            if(checkLeftAllSmaller(A, i) && checkRightAllGreater(A, i)) {
                System.out.println(i+"-- "+ A.get(i));
                return 1;
            }
        }
        return 0;
    }
    static boolean  checkLeftAllSmaller(List<Integer> A, int i){
        int num=A.get(i);
        for(int j=i-1;j>=0;j--){
            if(num<=A.get(j)){
                return false;
            }
        }
        return true;
    }
    static boolean checkRightAllGreater(List<Integer> A, int i){
        int num=A.get(i);
        for(int j=i+1;j<A.size();j++){
            if(num>=A.get(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(perfectPeak(Arrays.asList(9488, 25784, 5652, 9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529)));
    }
}
