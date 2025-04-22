import java.util.Arrays;

public class TwoSum2 {
    public static int[] two(int[] n,int target){
        int l=0,r=n.length-1;
        while(l<r){
            int sum=n[l]+n[r];
            if(sum==target) return new int[]{l+1,r+1};
            else if(sum<target) l++;
            else r--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] n={2,7,11,15};
        int target=18;
        System.out.println(Arrays.toString(two(n,target)));
    }
}
