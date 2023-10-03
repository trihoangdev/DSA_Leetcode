public class _852_Peak_Index_in_a_Mountain_Array {
    public static int bsearch(int[] a, int L, int R) {
        if (L > R)
            return -1;
        int i = (L + R) / 2;
        if (a[i] > a[i + 1] && a[i] > a[i - 1])
            return i;
        else if (a[i] < a[i - 1])
            return bsearch(a, L, i);
        else
            return bsearch(a, i, R);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        if (n <= 2)
            return -1;
        return bsearch(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(a));
    }
}
