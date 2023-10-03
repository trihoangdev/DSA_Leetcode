package LyThuyet;

import java.util.Arrays;

public class QuickSort {
    public static void QuickSort(int[] a, int L, int R) {
        //Dk dung
        if(L>=R)
        {
            return;
        }
        //B1: Chọn khoá
        int key = a[(L + R) / 2];

        //B2: Phân bố lại mảng theo khoá
        int k = partition(a, R, L, key);

        //B3: Chia đôi mảng => lặp lại
        QuickSort(a, L, k - 1);
        QuickSort(a, k, R);

    }

    //return pivot value
    public static int partition(int[] a, int R, int L, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            //voi iL, tim phan tu >= key de doi cho
            while (a[iL] < key)
                iL++;
            //voi iR, tim phan tu <= key de doi cho
            while (a[iR] > key)
                iR--;
            //doi cho 2 phan tu ko dung vi tri
            if(iL<=iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iR--;iL++;
            }
        }
        return iL;
    }


    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        QuickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
