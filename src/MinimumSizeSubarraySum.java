import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int mini(int[] n,int target){
        int min_l=Integer.MAX_VALUE,left=0,sum=0;
        for(int right=0;right<n.length;right++){
            sum+=n[right];
            while(sum>=target){
                min_l=Math.min(min_l,right-left+1);
                sum-=n[left];
                left++;
            }
        }
        return min_l==Integer.MAX_VALUE?0:min_l;
    }
    public static void main(String[] args){
        int[] n={2,3,1,2,4,3};
        int target=7;
        int res=mini(n,target);
        System.out.println(res);
    }
}
