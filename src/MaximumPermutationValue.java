import java.util.*;
public class MaximumPermutationValue {
    public static void revArray(char[] a){
        int l=0,r=a.length-1;
        while(l<r){
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;r--;
        }
    }
    public static int rev(int n){
        char[] a=Integer.toString(n).toCharArray();
        Arrays.sort(a);
        revArray(a);
        return Integer.parseInt(new String(a));
    }
    public static void main(String[] args){
        int n=43567;
        System.out.println(rev(n));
    }
}
