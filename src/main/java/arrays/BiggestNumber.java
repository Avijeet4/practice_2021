package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiggestNumber {
    static String printLargest(String[] arr) {
        // code here
        List<String> numbers= Arrays.asList(arr);
        StringBuilder biggestNumber=new StringBuilder();
        Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy=x+y;
                String yx=y+x;

                return xy.compareTo(yx)>0?-1:1;
            }
        });
        for(String number:numbers){
            biggestNumber.append(number);
        }
        return biggestNumber.toString();
    }

    public static void main(String[] args) {
        System.out.println(printLargest(new String[]{"3","30","34","5","9"}));
    }
}
