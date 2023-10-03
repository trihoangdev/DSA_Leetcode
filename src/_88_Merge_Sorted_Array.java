package BaiTap;

public class _88_Merge_Sorted_Array {
    /**
     * Thuật toán:
     * - Duyệt mảng n2
     * - Đặt cờ, cho duyệt mảng n1,
     * Khi phát hiện phần tử đầu tiên > phần tử thứ i của n2 truyền vào thì tắt cờ
     * và cho duyệt từ phần tử m-1 của mảng 1 về tới ptu trên và dời ra sau
     */
    public static void merge2(int[] n1, int m, int[] n2, int n) {
        for (int i : n2) {
            chen(i, n1, m);
            m++;
        }
    }

    private static void chen(int x, int[] a, int m) {
        boolean isChanged = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                isChanged = true;
                for (int i = m - 1; i >= k; i--)
                    a[i + 1] = a[i];
                a[k] = x;
                break;
            }
        }
        if (isChanged == false)
            a[m] = x;
    }


    public static void main(String[] args) {
        int[] n1 = {7, 8,9, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(n1, m, n2, n);
        showArr(n1);
    }

    private static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                if (n1[i] > n2[j]) {
                    n1[k] = n1[i];
                    k--;
                    i--;
                } else if (n2[j] > n1[i]) {
                    n1[k] = n2[j];
                    j--;
                    k--;
                }
            } else if (i >= 0) {
                n1[k] = n1[i];
                k--;
                i--;
            } else {
                n1[k] = n2[j];
                j--;
                k--;
            }
        }
    }

    private static void showArr(int[] n1) {
        for (int i : n1) {
            System.out.print(i + " ");
        }
    }

}
