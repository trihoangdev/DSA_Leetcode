import java.util.Arrays;

public class NEEDIMPROVE_2784_Check_if_Array_is_Good {
    public static boolean isGood(int[] nums) {
        if (nums.length < 2)
            return false;

        //tìm giá trị max của mảng
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        //ktra xem mảng có đúng max+1 phần tử không
        if (nums.length != max + 1)
            return false;

        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] <= nums[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 1, 2,1};
        System.out.println(isGood(arr));
    }
}
