import java.util.Arrays;

public class _414_Third_Maximum_Number {
    /**
     * Tìm phần tử lớn thứ 3 trong mảng
     * Thuật toán:
     * - Sắp xếp vongf lặp
     * - Chạy từ cuối lên đầu:
     * Nếu phần tử đang xét > phần tử trước đó thì count++
     * Nếu xét tới phần tử mà count = 2 thì return a[i-1] vì i-1 là vị trí của phần tử cần trả về
     *
     * @param a Mảng chứa phần tử cần tìm
     * @return phần tử lớn nhất nếu k tìm thấy phần tử thứ 3
     */
    public static int thirdMaxC1(int[] a) {
        Arrays.sort(a);
        int count = 0;
        for (int i = a.length - 1; i >= 1; i--) {
            if (a[i] > a[i - 1]) {
                count++;
            }
            if (count == 2)
                return a[i - 1];
        }
        return a[a.length - 1];
    }


    public static void main(String[] args) {
        int[] a = {1, 2,-2147483648};
        System.out.println(thirdMax(a));
    }

    private static int thirdMax(int[] a) {
        long max = Long.MIN_VALUE, smax = Long.MIN_VALUE, tmax = Long.MIN_VALUE;
        for (int i : a)
            if (i > max) {
                tmax = smax;
                smax = max;
                max = i;
            } else if (i > smax && i != max) {
                tmax = smax;
                smax = i;
            } else if (i > tmax && i != max && i != smax) {
                tmax = i;
            }
        return (tmax == Long.MIN_VALUE) ? (int) max : (int) tmax;
    }
}
