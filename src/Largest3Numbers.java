import java.util.*;

public class Largest3Numbers {
    public static void lar(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != prev) {
                System.out.print(a[i] + " ");
                count++;
                prev = a[i];
            }
            if (count == 3) break;
        }
    }
    public static void main(String[] args) {
        int[] a = {15, 2, 3, 4, 10, 60, 80};
        lar(a);
    }
}