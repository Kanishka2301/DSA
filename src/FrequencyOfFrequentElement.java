import java.util.Arrays;

public class FrequencyOfFrequentElement {
    public static int demo(int[] n,int k){
        Arrays.sort(n);
        int l=0,r=0,res=0;
        long sum=0;
            while(r<n.length){
                sum+=n[r];
            while((r-l+1)*n[r]>k+sum) {
                sum -= n[l];
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
            }

        return res;
    }
    public static void main(String[] args){
        int[] n={1,4,8,13};
        int k=5;
        System.out.println(demo(n,k));
    }
}
