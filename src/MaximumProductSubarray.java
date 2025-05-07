public class MaximumProductSubarray {
    public static int maxi(int[] nums){
        int n=nums.length, lp=1,rp=1,ans=nums[0];
        for(int i=0;i<n;i++){
            lp=lp==0?1:lp;
            rp=rp==0?1:rp;
            lp*=nums[i];
            rp*=nums[n-1-i];
            ans=Math.max(ans,Math.max(lp,rp));
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={2,3,-2,-5,6,-1,4};
        System.out.println(maxi(nums));
    }
}
