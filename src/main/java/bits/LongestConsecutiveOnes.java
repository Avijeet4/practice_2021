package bits;
//You don't need to read input or print anything. Your task is to complete the function maxConsecutiveOnes()
// which returns the length of the longest consecutive 1s in the binary representation of given N.
//Example 1:
//
//Input: N = 14
//Output: 3
//Explanation:
//Binary representation of 14 is
//1110, in which 111 is the longest
//consecutive set bits of length is 3.
public class LongestConsecutiveOnes {
    public static int maxConsecutiveOnes(int N) {

        // Your code here
        int maxCnt=0;
        int cnt=0;
        while(N>0){
            if(N%2==1)
                cnt++;
            else
                cnt=0;
            maxCnt=Math.max(cnt, maxCnt);
            N>>=1;
        }
        return maxCnt;
    }

    public static void main(String[] args) {
        System.out.println(222);
    }
}
