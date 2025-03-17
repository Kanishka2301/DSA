import java.util.*;

class Solution {  // Renamed to PascalCase as per Java conventions
    public int demo(int[] n, int k) {
        int l = 0, r = 0, res = 0;
        long sum = 0; // Initialize sum to 0 instead of n[0]

        while (r < n.length) {
            sum += n[r];  // Add the current element to sum

            // Check if the condition is violated
            while ((r - l + 1) * n[r] > k + sum) {
                sum -= n[l];  // Shrink the window
                l++;
            }

            // Update the maximum subarray size
            res = Math.max(res, r - l + 1);
            r++;  // Expand the window
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] n = {1, 4, 8, 13};
        int k = 5;
        System.out.println(s.demo(n, k));  // Expected output: 2
    }
}
