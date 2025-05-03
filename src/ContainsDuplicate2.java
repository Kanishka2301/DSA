import java.util.HashSet;

public class ContainsDuplicate2 {
    public static boolean con(int[] nums,int k){
        HashSet<Integer> n=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(n.contains(nums[i])){
                return true;
            }
            n.add(nums[i]);
            if(n.size()>k){
                n.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(con(nums,k));
    }
}
