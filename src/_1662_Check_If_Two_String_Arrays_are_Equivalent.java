
public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();

        for (String s: s1)
            r1.append(s);

        for (String s: s2)
            r2.append(s);

        return r1.toString().equals(r2.toString());
    }


}
