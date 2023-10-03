import java.util.Arrays;

public class NEEDIMPROVE_217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1)
            return false;
        Arrays.sort(nums); //Time Complexity: nlogn

        boolean isFound = false;
        //Time Complexity: n
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                isFound = true;
                break;
            }
        }
        return isFound;

        //Time Complexity: nlogn
    }

    public static void main(String[] args) {
        int[] b = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(b));
    }
}
