package recursion;

import java.util.List;

public class GeneratePowerSet {
    static void powerSet(String str, String curr, int i){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        powerSet(str, curr+str.charAt(i), i+1);
        powerSet(str, curr, i+1);
    }

    public static void main(String[] args) {
        powerSet("abc","",0);
    }
}
