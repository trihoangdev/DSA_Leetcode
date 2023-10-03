import java.util.Arrays;

public class _164_Maximum_Gap {
    public static int maximumGap(int[] a) {
        if (a.length < 2)
            return 0;
        if (a.length == 2)
            return Math.max((a[1] - a[0]), 0);
        Arrays.sort(a);
        int i = 1;
        int j = 2;
        int min = Math.abs(a[0] - a[1]);
        while (j < a.length) {
            min = Math.max(minus(a[i], a[j]), min);
            i++;
            j++;
        }
        return min;
    }

    private static int minus(int a, int b) {
        if (a > b)
            return 0;
        return b - a;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 1};
        System.out.println(maximumGap(a));
    }
}
