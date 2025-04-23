import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] inter(int[] n1,int[] n2){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<n1.length;i++){
            s1.add(n1[i]);
        }
        for(int i=0;i<n2.length;i++){
            s2.add(n2[i]);
        }
        s1.retainAll(s2);
        int[] res=new int[s1.size()];
        int j=0;
        for(int ele:s1){
            res[j++]=ele;
        }
        return res;
    }
    public static void main(String[] args){
        int[] n1={1,2,2,1};
        int[] n2={2,2};
        System.out.println(Arrays.toString(inter(n1,n2)));
    }
}
