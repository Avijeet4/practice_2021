package bits;
//Check whether K-th bit is set or not
//Easy Accuracy: 51.27% Submissions: 36524 Points: 2
//Given a number N and a bit number K, check if Kth bit of N is set or not. A bit is called set if it is 1.
//Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
public class CheckKthBit {
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        return (n&(1<<k))==(1<<k);
    }

    public static void main(String[] args) {
        System.out.println(checkKthBit(4,0));
        System.out.println(checkKthBit(4,2));
    }
}
