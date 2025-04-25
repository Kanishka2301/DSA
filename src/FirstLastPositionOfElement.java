import java.util.Arrays;

public class FirstLastPositionOfElement {
    public static int[] first(int[] nums,int target) {
        int[] result = {-1, -1}; // Default if target not found

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) { // First occurrence
                    result[0] = i;
                }
                result[1] = i; // Last occurrence (keeps updating)
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,9,2};
        int target=8;
        System.out.println(Arrays.toString(first(nums,target)));
    }
}
