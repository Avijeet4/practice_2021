package arrays;

public class MaxOccurredInteger {
    public static int maxOccurred(int L[], int R[], int n, int maxx){

        int cnt[]=new int[maxx+2];
        for(int i=0;i<n;i++){
            cnt[L[i]]++;
            cnt[R[i]+1]--;
        }

        int max=cnt[0];
        int maxI=0;
        for(int i=1;i<=maxx;i++){
            cnt[i]+=cnt[i-1];
            if(max<cnt[i]){
                max=cnt[i];
                maxI=i;
            }
        }
        return maxI;
    }

    public static void main(String[] args) {
        System.out.println(maxOccurred(
                new int[]{1,4,3,1},
                new int[]{15,8,5,4},
                4,
                15
                ));
    }
}
