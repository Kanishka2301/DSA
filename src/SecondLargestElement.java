import java.util.*;

public class SecondLargestElement {
    public static void sec(int[] a) {
        int n = a.length;
        if (n < 2) {
            System.out.println("No second largest element");
            return;
        }
        Arrays.sort(a);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[n - 1]) {
                System.out.println("Second largest element: " + a[i]);
                return;
            }
        }
        System.out.println("No second largest element");
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 35, 34, 35};
        sec(a);
    }
}