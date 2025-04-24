import java.util.*;

public class IntersectionOfMultipleArrays {
    public static List<Integer> inter(int[][] nums){
        int[] freq=new int[1001];
        for(int[] n:nums){
            for(int ele:n){
                freq[ele]++;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<1001;i++){
            if(freq[i]==nums.length){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] nums={{1,2,3},{2,3,4},{2,3,5}};
        System.out.println(inter(nums));
    }
}
