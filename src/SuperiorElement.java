import java.util.*;
public class SuperiorElement {
    public static List<Integer> sin(int[] a){
        ArrayList<Integer> sup=new ArrayList<>();
        int n=a.length;
        int maxRight=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>maxRight) {
                sup.add(a[i]);
                maxRight=a[i];
            }
        }
        return sup;
    }
    public static void main(String[] args){
        int[] a={1,2,3,2};
        System.out.print(sin(a));
    }
}
