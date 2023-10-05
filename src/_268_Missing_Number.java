
import java.util.Arrays;

public class _268_Missing_Number {
    public static int missingNumber(int[] a) {
        int sum = a.length;
        for(int i = 0;i<a.length;i++){
            sum+=(i-a[i]);
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] a = {3, 0, 1};
        System.out.println(missingNumber(a));
    }
}
