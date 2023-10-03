public class _367_Valid_Perfect_Square {
    public static boolean isPerfectSquare(int n) {
        int sqrt = sqrt(n);
        if (sqrt * sqrt == n)
            return true;
        return false;
    }

    private static int sqrt(int n) {
        if (n == 0)
            return 0;
        int first = 1;
        int last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == n / mid)
                return mid;
            else if (mid > n / mid)
                last = mid - 1;
            else
                first = mid + 1;
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(8));
    }
}
