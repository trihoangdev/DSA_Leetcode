public class _283_Move_Zeroes {
    public static void moveZeroes(int[] a) {
        int curIndex = 0;
        for (int i = 0;i<a.length;i++)
            if(a[i]!=0)
            {
                a[curIndex] = a[i];
                curIndex++;
            }
        for (int i = curIndex;i<a.length;i++)
        {            a[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        showArr(a);
        moveZeroes(a);
        System.out.println();
        showArr(a);
    }

    private static void showArr(int[] a) {
        for (int i: a)
            System.out.print(i + " ");
    }
}
