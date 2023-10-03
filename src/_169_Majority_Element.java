import java.util.Arrays;

public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        /*Time complexity: O(n logn)
        Space complexity: O(1)*/
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }



    public static void main(String[] args) {
        int[] a = {3, 2, 3};
    }
}
