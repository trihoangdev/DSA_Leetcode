public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        for (int i = 1; i <= n - m; i++) {
            if (s1.substring(i, i + m).equals(s2))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "issipi";
        System.out.println(strStr(s1, s2));
    }
}
