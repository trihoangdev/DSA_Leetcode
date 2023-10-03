public class _374_Guess_Number_Higher_or_Lower {
    static int n;

    public static int guess(int num) {
        if (num == n)
            return 0;
        else if (num < n)
            return 1;
        else //num<n
            return -1;
    }

    public static int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = (l + r) / 2;
            if (guessNumber(mid) == -1)
                r = mid-1;
            else if(guessNumber(mid) == 1)
                l = mid+1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guess(10));
    }
}
