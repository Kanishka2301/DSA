import java.util.Arrays;

public class CountTriplets {
    public static int c(int[] a){
        Arrays.sort(a);
        int n=a.length,count=0;
        for(int i=n-1;i>=0;i--){
            int j=0,k=i-1;
            while(j<k){
                if(a[j]+a[k]==a[i]){
                    count++;
                    j++;
                    k--;
                }
                else if(a[j]+a[k]<a[i]){
                    j++;
                }
                else k--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] a={1,5,3,2};
        System.out.print(c(a));
    }
}
