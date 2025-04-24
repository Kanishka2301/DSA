import java.util.*;
public class IntersectionOfTwoArrays2 {
    public static int[] inter(int[] n1,int[] n2){
        List<Integer> set=new ArrayList<>();
        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    set.add(n2[j]);
                    n2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] res=new int[set.size()];
        int k=0;
        for(int ele:set){
            res[k++]=ele;
        }
        return res;
    }
    public static void main(String[] args){
        int[] n1={1,2,2,1},n2={2,2};
        System.out.println(Arrays.toString(inter(n1,n2)));
    }
}
