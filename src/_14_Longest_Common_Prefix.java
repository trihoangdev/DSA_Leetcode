import java.util.Arrays;


public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] s) {
        if (s.length == 0)
            return "";
        String s1 = "";
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];
        int i = 0;
        int k = Math.min(first.length(), last.length());

       /* while (i < k) {
            if (first.charAt(i) == last.charAt(i)) {
                s1 += s[0].charAt(i);
                i++;
            } else
                break;
        }*/

        return first.substring(0,5);
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(s));
    }
}
