import java.util.*;

public class ThreeSum {
    public static  List<List<Integer>> three(int[] a){
        if(a==null || a.length<3) return null;
        Arrays.sort(a);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=1;i<a.length-2;i++){
            int l=i+1,r=a.length-1;
            while(l<r){
                int sum=a[i]+a[l]+a[r];
                if(sum==0){
                    res.add(Arrays.asList(a[i],a[l],a[r]));
                    l++;r--;
                }
                else if(sum<0) l++;
                else r--;
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args){
        int[] a={-1,0,1,2,-1,-4};
        System.out.println(three(a));
    }
}
