public class _50_Pow_x_n {
    public static double myPow(double x, int n) {
        //dk dung
        if (n == 0)
            return 1;
        //x^n = x^(n/2) * x^(n/2)
        int n_2 = 0;

        if (n < 0) {
            if (n % 2 == 0) {
                /*n_2 = n / 2;
                n_2 = -n_2;*/
                n_2 = -n ;
                n_2 = n_2 / 2;
            } else {
                n_2 = -n - 1;
                n_2 = n_2 / 2;
            }
            //n_2 = n % 2 == 0 ? -(n / 2) : (-n - 1) / 2;
            x = 1 / x;
        } else {
            n_2 = n % 2 == 0 ? (n / 2) : (n - 1) / 2;
        }
        double t;
        if (n % 2 == 0) {
            //x^4 = x^2 * x^2
            t = myPow(x, n_2);
            return t * t;
        } else {
            //x^5 = x * x^2 * x^2
            t = myPow(x, n_2);
            return x * t * t;
        }

    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483648));
    }
}
