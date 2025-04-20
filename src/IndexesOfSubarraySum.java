import java.util.*;

public class IndexesOfSubarraySum {
    public static int[] subsum(int[] a, int target) {
        int i = 0, j = 0, n = a.length;
        if (n == 0) return new int[]{-1};
        int sum = a[0];
        while (j < n) {
            if (sum < target) {
                j++;
                if (j < n) {
                    sum += a[j];
                }
            } else if (sum > target) {
                sum -= a[i];
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7, 5};
        int target = 12;
        int[] res = subsum(a, target);
        System.out.println(res[0] + "," + res[1]); // Output: 3 4
    }
}