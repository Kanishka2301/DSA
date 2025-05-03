import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean con(int[] nums){
        HashSet<Integer> n=new HashSet<>();
        for(int num:nums){
            if(!n.add(num)) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        System.out.println(con(nums));
    }
}
