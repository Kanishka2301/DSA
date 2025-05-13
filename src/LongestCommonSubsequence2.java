import java.util.*;
public class LongestCommonSubsequence2 {
    public static int lon(int[] a){
        int n=a.length,count=1,maxi=1;
        if(n==0) return 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else if (a[i] != a[i - 1]) {
                count = 1;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] a={100,4,34,1,2,3};
        System.out.print(lon(a));
    }
}
