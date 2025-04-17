public class RemoveDuplicates {
    public static int rem(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(rem(nums));
    }
}