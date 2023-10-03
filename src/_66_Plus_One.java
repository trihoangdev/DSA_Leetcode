public class _66_Plus_One {
    public static int[] plusOne(int[] a) {
        int i = a.length-1;
        while(i>=0)
        {
            if(a[i] < 9)
            {
                a[i]++;
                return a;
            }
            a[i] = 0;
            i--;
        }
        a = new int[a.length+1];
        a[0] = 1;
        return a;
    }

    public static void main(String[] args) {
        int[] a = {9,9,9};
        plusOne(a);

    }

    private static void showArr(int[] res) {
        for (int i : res)
            System.out.print(i + " ");
    }
}
