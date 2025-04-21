import java.util.Arrays;

public class Sort01 {
    public static int[]  demo(int[] a) {
        int i= 0, j = 0;
        while (i<a.length) {
            if (a[i] == 1) {
               i+=1;
            } else {
                swap(a,i,j);
                i+=1;
                j+=1;
            }
        }
        return a;
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(demo(a))); // Print the sorted array
    }
}