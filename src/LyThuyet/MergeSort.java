package LyThuyet;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a, int L, int R) {
        //DK dung
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        //chia ra
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        //tron vao
        int n = a1.length + a2.length;
        int[] res = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length)//a1 & a2 != rong
            {
                if (a1[i1] <= a2[i2]) {
                    res[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else { //a1 or a2 rong
                if (i1 < a1.length) //a1 ok
                {
                    res[i] = a1[i1];
                    i++;
                    i1++;
                } else {//a2 ok
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return res;
    }

    public static int[] sortArray(int[] a) {
        return mergeSort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 1, 2, 0, 0};
        int[] b = sortArray(a);
        System.out.println(Arrays.toString(b));
    }
}
