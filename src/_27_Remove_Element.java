public class _27_Remove_Element {
    public static int removeElement2(int[] a, int x) {
        int n = a.length;
        for (int i = 0; i < n; )
            if (a[i] == x) {
                for (int k = i; k < n - 1; k++)
                    a[k] = a[k + 1];
                n--;
                i--;
            } else
                i++;
        return n;
    }

    public static void main(String[] args) {
        int[] n = {3, 2, 2, 3};
        System.out.println(removeElement(n, 2));

    }

    public static int removeElement(int[] a, int x) {
        int curIndex = 0;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i] != x)
            {
                a[curIndex] = a[i];
                curIndex++;
            }
        }

        return curIndex;
    }


    private static void showArr(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
