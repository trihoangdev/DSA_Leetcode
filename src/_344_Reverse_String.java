public class _344_Reverse_String {


    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right)
        {
            char t = s[right];
            s[right] = s[left];
            s[left] = t;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'1','2','3','4','5'};
        reverseString(s);
    }
}
