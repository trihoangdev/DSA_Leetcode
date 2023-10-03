import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] a) {
        //B1: tim phan tu lon nhat tu i den n-1
        int n = a.length;
        for (int i = n - 1; i >= 0; i--)
            if (i != n - 1) {
                a[i] = Math.max(a[i],a[i+1]);
            }
        //B2: dịch mảng sang trái 1 đơn vị
        for(int i = 1;i<n;i++)
            a[i-1] = a[i];
        //B3:update phần tử cuối cùng bằng -1
        a[n-1] = -1;
        return a;
    }

    public static void main(String[] args) {
        int[] a = {17, 18, 5, 4, 6, 1};
        int[] b = {400};
        a = replaceElements(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
