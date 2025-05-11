import java.util.*;

public class MajorityElement {
    public static int maj(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4};
        System.out.print(maj(nums));
    }
}
