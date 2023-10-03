public class _509_Fibonacci_Number {
    static int[] f = new int[31];
    public static int fib(int n) {
       if(f[n]!=0)
           return f[n];
       if(n<=1)
       {
           f[n] = n;
           return n;
       }
       f[n] = fib(n-1) + fib(n-2);
       return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
