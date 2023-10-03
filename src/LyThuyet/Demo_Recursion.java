package LyThuyet;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Demo_Recursion {


    public static void main(String[] args) {
//        thapHaNoi(4, 'A', 'B', 'C');
//        int[] a = {1,3,2,5,6};
//        ShowArrDESC(a,a.length-1);
        System.out.println(Fibo2(10));
    }

    static int[] f = new int[1000];
    private static int Fibo2(int n) {
        if(f[n] !=0)
            return f[n];
        if(n<=2)
        {
            f[1] = 1;
            f[2] = 1;
            return 1;
        }
        f[n] = Fibo2(n-1) + Fibo2(n-2);
        return f[n];
    }

    private static void ShowArrDESC(int[] a, int n) {
//        a = {1,3,2,5,6};
        if (n < 0 || n>=a.length) {
            return;
        }
        ShowArr(a, n+=1);
        System.out.print(a[n] + " ");
    }

    /**
     * Chuyển n đĩa từ cột a sang cột c
     * - Nếu chỉ có 1 đĩa thì chuyển trực tiếp từ cột a -> c
     * - Nếu có 2 đĩa thì chuyển đĩa 1 từ cột a-> b, đĩa 2 từ cột a -> c, đĩa 1 từ cột b -> c
     * - Nếu có n đĩa
     * B1: Chuyển n-1 đĩa từ cột a -> b
     * B2: Chuyển đĩa n từ cột a -> c
     * B3: Chuyển n-1 đĩa từ cột b -> c
     *
     * @param n số đĩa cần chuyển
     * @param a cột ban đầu
     * @param b cột trung gian
     * @param c cột đích
     */
    private static void thapHaNoi(int n, char a, char b, char c) {
        if (n == 1)
            chuyen(n, a, c);
        else //nếu có từ 2 đĩa trở lên
        {
            //chuyển n-1 điax từ cột a -> b
            thapHaNoi(n - 1, a, c, b);
            //chuyển đĩa n từ cột a->c
            chuyen(n, a, c);
            //chuyển n-1 đĩa từ cột b-> c
            thapHaNoi(n - 1, b, a, c);
        }
    }

    private static void chuyen(int n, char a, char c) {
        System.out.println("Chuyển đĩa thứ " + n + " từ cột " + a + " sang cột " + c);
    }

    private static int BCNN(int a, int b, int i) {
        if (i % a == 0 && i % b == 0)
            return i;
        return BCNN(a, b, ++i);
    }

    private static int UCLN(int a, int b, int i) {
        if (a % i == 0 && b % i == 0)
            return i;
        return UCLN(a, b, i - 1);
    }


    private static void ShowArr(int[] a, int n) {
        if (n < 0 || n>=a.length) {
            return;
        }
        System.out.print(a[n] + " ");
        ShowArr(a, n+=1);
    }

    private static int TinhSoMu(int a, int n) {
        //dk dung
        if (n == 0)
            return 1;
        return a * TinhSoMu(a, n - 1);
    }

    private static int Sum1ToN(int n) {
        //dieu kien dung
        if (n == 1)
            return 1;
        return n + Sum1ToN(n - 1);
    }

    private static int Fibo(int n) {
        //cong thuc co so
        if (n <= 2)
            return 1;
        //cong thuc tong quat
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
