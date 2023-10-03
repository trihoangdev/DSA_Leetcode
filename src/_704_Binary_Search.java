package BaiTap;

public class _704_Binary_Search {
    public static int bsreach(int[] a, int L, int R, int x) {
        //dk dung
        if (L > R)
            return -1;
        //B1. Tim phan tu o giua
        int k = (L + R) / 2;
        //B2.So sanh a[k] va x
        if (a[k] == x)
            return k;
        if(x>a[k])
            return bsreach(a,k+1,R,x);
        return bsreach(a,L,k-1,x);
    }

    public static int search(int[] a, int x) {
        return bsreach(a,0,a.length-1,x);
    }

    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        int n = search(a, 13);
    }
}
