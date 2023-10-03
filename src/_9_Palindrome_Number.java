public class _9_Palindrome_Number {
    /**
     * Given an integer x, return true if x is palindrome and false otherwise.
     * x = 121 => true
     * x = -121 => false
     */
    public static boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0)
            return false;
        //int n = 0;
        String s = String.valueOf(x);
        int start = 0;
        int end = s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
        /*while (x > n) {
            n = n * 10 + x % 10;
            x /= 10;
        }*/
        //return x == n || x == n / 10;
    }

    private static int revert(int x) {
        int res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12345421));
    }
}
