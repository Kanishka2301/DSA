import java.util.*;

public class MergeWithoutExtraSpace {
    public static void merge(long[] a,long[] b){
        int n=a.length,m=b.length;
        for(int i=0;i<n;i++){
            if(a[i]>b[0]) {
                long temp = a[i];
                a[i]=b[0];
                b[0]=temp;
            }
            long first=b[0];
            int j;
            for( j=1;j<m && b[j]<first;j++){
                b[j-1]=b[j];
            }
            b[j-1]=first;
        }
    }
    public static void main(String[] args){
        long[] a={2,4,7,10};
        long[] b={2,3};
       merge(a,b);
        for (long num : a) {
            System.out.print(num);
        }
        for (long num : b) {
            System.out.print(num);
        }
    }
}
