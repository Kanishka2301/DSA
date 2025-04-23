import java.util.*;
public class ThreeSumClosest {
    public static int three(int[] a,int target){
        Arrays.sort(a);
        int clsum=a[0]+a[1]+a[2];
        for(int i=0;i<a.length-2;i++){
            int l=i+1,r=a.length-1;
            int sum=a[i]+a[l]+a[r];
            if(Math.abs(target-sum) < Math.abs(target-clsum)){
                clsum=sum;
            }
            if(sum<target) l++;
            else if(sum>target) r--;
            else return sum;
        }
        return clsum;
    }
    public static void main(String[] args){
        int[] a={-1,2,1,-4};
        int target=1;
        System.out.println(three(a,target));
    }
}
