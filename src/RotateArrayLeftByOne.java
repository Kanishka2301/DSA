import java.util.Arrays;

public class RotateArrayLeftByOne {
    public static int[] rot(int[] a) {
        int n = a.length;
        if (n <= 1) return a;
        int first = a[0];
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = first;
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = rot(a);
        System.out.println(Arrays.toString(a));
    }
}