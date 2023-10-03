import java.util.Arrays;

public class _242_Valid_Anagram {


    public static boolean isAnagram(String s, String t) {
        if (s.length() < 1 || t.length() < 1 || s.length() != t.length())
            return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String s1 = new String(sArr);
        String s2 = new String(tArr);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s = "abdc";
        String t = "dbac";
        System.out.println(isAnagram(s, t));
    }
}
