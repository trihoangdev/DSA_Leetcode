public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] a) {
        // tìm max
        int max = 0;
        int indexOfMax = 0;
        for (int i =0;i<a.length;i++)
            if(a[i]>max)
            {
                max = a[i];
                indexOfMax = i;
            }
        if(indexOfMax == 0 || indexOfMax == a.length-1)
            return false;

        for (int i = 1; i <= indexOfMax; i++)
            if (a[i] <= a[i - 1]) {
                return false;
            }

        for (int i = indexOfMax+ 1; i < a.length; i++)
            if (a[i] >= a[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] a = {2,1};
        int[] b = {3,5,5};
        int[] c = {0,3,2,1};
        if (validMountainArray(c))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
