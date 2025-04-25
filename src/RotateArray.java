import java.util.*;

public class RotateArray {
    public static void rev(int[] a,int i,int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
    public static void rot(int[] a,int k){
        int n=a.length;
        k=k%n;
        rev(a,0,n-1);
        rev(a,0,k-1);
        rev(a,k,n-1);
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        rot(a, k);
        System.out.println(Arrays.toString(a));
    }
}
