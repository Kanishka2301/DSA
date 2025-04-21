import java.util.Arrays;

public class Sort012 {
    public static int[] demo(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, high);
                high--;
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
        int[] a = {1, 2, 0, 1, 2, 0};
        System.out.println(Arrays.toString(demo(a))); // Print the sorted array
    }
}