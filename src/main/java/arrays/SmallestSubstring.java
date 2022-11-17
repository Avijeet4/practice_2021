//package arrays;
//
//public class SmallestSubstring {
//    int[] freq1;
//    int[] freq2;
//    int min=Integer.MAX_VALUE;
//    String smallestSubstring;
//    static String findSmallestSubstring(String s1, String s2){
//        int[] freq1=new int[26];
//        int[] freq2=new int[26];
//        int[] curr=new int[26];
//
//        for(char c:s2.toCharArray()){
//            freq2[c-'a']++;
//        }
//        int i=0,j=s1.length()-1;
//        while(i<j){
//            char c=s1.charAt(j);
//            if(freq1[c]<freq2[c]){
//                freq1[c]++;
//            }
//        }
//    }
//
//    void findSmallest(int[] curr, int i, int j){
//        while(freq2[i]==0){
//            i++;
//        }
//        while(freq2[j]==0){
//            j--;
//        }
//        findSmallestSubstring();
//    }
//    boolean isValidCharacter(int[] freq1, int[] freq2, char c){
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
