import java.util.Stack;

public class _20_Valid_Parentheses_Use_Stack {
    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char curChar = s.charAt(i);
            if (curChar == '(' || curChar == '[' || curChar == '{') {
                stack.push(curChar);
            } else {
                if (stack.isEmpty())
                    return false;
                char prevChar = stack.pop();
                if ((prevChar == '(' && curChar == ')')
                        || (prevChar == '[' && curChar == ']')
                        || (prevChar == '{' && curChar == '}')) {
                    //ok
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
}
