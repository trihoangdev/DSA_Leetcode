public class _441_Arranging_Coins {
    public static int arrangeCoins(int n) {
        long s = 1, e = n, mid, ans = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            long temp = (mid * (mid + 1)) / 2;
            if (temp <= n) {
                ans = mid;
                s = mid + 1;
            } else
                e = mid - 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
