public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String s) {
        //bo ' ' va '_'
        s = s.replaceAll("[ -]", "");
        return F(s);
    }

    public static String F(String s) {
        int n = s.length();
        if (n == 2 || n == 3)
            return s;
        if (n == 4)
            return s.substring(0, 2) + "-" + s.substring(2);
        return s.substring(0, 3) + "-" + F(s.substring(3));
    }

    public static void main(String[] args) {
        String s = "1-23-45 6";
        System.out.println(reformatNumber(s));
    }
}
