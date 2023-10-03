public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] a) {
        int k = 0;
        int i = a.length - 1;
        while (k < i) {
            if (a[k] % 2 == 0)
                k++;
            else //a[k] lẻ
                if (a[i] % 2 == 0) //a[i] chẵn
                {
                    //swap
                    int t = a[i];
                    a[i] = a[k];
                    a[k] = t;
                    i--;
                } else //a[i] lẻ
                    i--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 1, 4};
        sortArrayByParity(a);
    }
}
