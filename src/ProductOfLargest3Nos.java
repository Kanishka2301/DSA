import java.util.*;
public class ProductOfLargest3Nos {
    public static void main(String[] args){
        int[] a={1,10,5,6,7,8};
        int n=a.length;
        if(n<3) return;
        Arrays.sort(a);
            int max=a[n-1]*a[n-2]*a[n-3];
            System.out.print(max);
      }
    }

