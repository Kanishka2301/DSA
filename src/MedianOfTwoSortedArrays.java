import java.util.*;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged.add(nums1[i++]);
            } else {
                merged.add(nums2[j++]);
            }
        }
        while (i < nums1.length) merged.add(nums1[i++]);
        while (j < nums2.length) merged.add(nums2[j++]);
        int mid = merged.size() / 2;
        if (merged.size() % 2 == 0) {
            return (merged.get(mid - 1) + merged.get(mid)) / 2.0;
        } else {
            return merged.get(mid);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));  // Output: 2.0

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));  // Output: 2.5
    }
}