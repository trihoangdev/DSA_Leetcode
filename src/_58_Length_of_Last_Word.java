public class _58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() <= 1)
            return s.length();
        int index = s.length() - 1;
        boolean check = true;
        while (check) {
            if (s.charAt(index) == ' ') {
                check = false;
            }
            index--;
            if(index==-1)
                return s.length();
        }
        return s.length() - 1 - index-1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("    day"));
    }
}
