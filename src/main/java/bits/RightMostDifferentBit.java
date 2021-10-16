package bits;
//Rightmost different bit
//Easy Accuracy: 56.24% Submissions: 22777 Points: 2
//Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
//
//Example 1:
//
//Input: M = 11, N = 9
//Output: 2
//Explanation: Binary representation of the given
//numbers are: 1011 and 1001,
//2nd bit from right is different.

public class RightMostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n)
    {

        return FirstRightMostSetBits.getFirstSetBit(m^n);

    }

    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(52,4));
    }
}
