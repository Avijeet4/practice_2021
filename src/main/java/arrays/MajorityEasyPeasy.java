package arrays;

public class MajorityEasyPeasy {
    public static int majorityWins(int arr[], int x, int y) {
        // code here
        int cntX=0;
        int cntY=0;
        for(int num:arr){
            if(num==x)
                cntX++;
            if(num==y)
                cntY++;
        }
        if(cntX>cntY){
            return x;
        }
        if(cntX<cntY){
            return y;
        }
        if(cntX==cntY )
            return Math.min(x,y);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityWins(new int[]{1,2,3,4,4,4,4,4,4,5,5}, 4,5));
    }
}
