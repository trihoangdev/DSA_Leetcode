 
import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {

    public static int[] sortedSquares(int[] a) {
        int[] b = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(a[i], 2);
        }

        Arrays.sort(a);
        return a;
    }

    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        a = sortedSquares(a);
        System.out.println(Arrays.toString(a));

    }
}
