public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] a) {
        int k = 0;
        for(int i = 0; i<a.length;i++)
            if(a[k]!=a[i])
            {
                a[k] = a[i];
                k++;
            }
        return k;
    }

    public static void main(String[] args) {
        int[] a ={1,1,2};
        System.out.println(removeDuplicates(a));
        System.out.println();
        showArr(a);
    }

    private static void showArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
