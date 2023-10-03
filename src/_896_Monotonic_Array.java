public class _896_Monotonic_Array {
    public static boolean isMonotonic(int[] nums) {
        if (nums.length < 2)
            return true;
        int direction = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                //increase
                if (direction == 0) direction = 1;
                else if (direction == -1) return false;
            } else if(nums[i] < nums[i-1]){
                //decrease
                if (direction == 0) direction = -1;
                else if (direction == 1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        System.out.println(isMonotonic(a));
    }
}