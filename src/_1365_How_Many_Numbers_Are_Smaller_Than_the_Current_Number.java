public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
   /* public static int[] smallerNumbersThanCurrent(int[] a) {
        int k = 0;
        int n = a.length;
        int[] b = new int[n];
        int i;
        while (k < n) {
            for (i = k + 1; i < n; i++)
                if (a[i] > a[k])
                    b[i]++;
                else if(a[i]<a[k])
                    b[k]++;
            k++;
        }
        return b;
    }*/

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] count = new int[10];
        int[] res = new int[nums.length];

        //Đếm số lượng số xuất hiện trong nums
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        // tạo ra một mảng count mới, trong đó count[i]
        // chứa tổng số lượng các số nhỏ hơn hoặc bằng i.
        for (int i = 1; i <= 9; i++) {
            count[i] += count[i - 1];
        }
        /**
         * Vòng lặp cuối cùng duyệt qua mảng nums và tính giá trị tương ứng cho mảng res.
         * Nếu nums[i] bằng 0, tức là số nhỏ nhất, thì res[i] được gán bằng 0.
         * Ngược lại, res[i] được gán bằng count[nums[i] - 1],
         * tức là số lượng các số nhỏ hơn nums[i].
         */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        return res;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        int[] res = new int[n];

        //đếm số lượng số xuất hiện trong nums
        for (int i : nums)
            count[i]++;
        //tạo ra mảng count mới chứa tổng số lươngj các số nhỏ hơn hoặc bằng i
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        return res;
    }

    public static void main(String[] args) {
        int[] a = {8, 1, 2, 2, 3};
        int[] b = smallerNumbersThanCurrent2(a);
        showArr(b);
    }

    private static void showArr(int[] b) {
        for (int i : b)
            System.out.print(i + " ");
    }
}
