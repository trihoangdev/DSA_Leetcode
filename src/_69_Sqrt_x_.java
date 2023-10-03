public class _69_Sqrt_x_ {
    public static int mySqrt(int x) {
        if(x==0)
            return 0;
        int L = 1;
        int R = x;
        while(L<=R)
        {
            int M = (R-L)/2 +L;//tbc
            if(M == x/M)
                return M;
            else if(M>x/M)
                R = M-1;
            else //M<x/M
                L = M+1;
        }
        return R;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}
