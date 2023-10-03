import java.util.Stack;

public class _20_Valid_Parentheses {
    static class MyStack {
        class Node {
            char value;
            Node next;

            Node(char v) {
                this.value = v;
                next = null;
            }
        }

        Node topNode;

        public void push(char value) {
            Node newNode = new Node(value);
            if (!isEmpty())
                newNode.next = topNode;
            topNode = newNode;
        }

        private boolean isEmpty() {
            return topNode == null;
        }

        public char pop() {
            char value = topNode.value;
            topNode = topNode.next;
            return value;
        }
    }


    public static boolean isValid(String s) {
        MyStack myStack = new MyStack();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char curChar = s.charAt(i);
            if (curChar == '(' || curChar == '[' || curChar == '{') {
                myStack.push(curChar);
            } else {
                if (myStack.isEmpty())
                    return false;
                char prevChar = myStack.pop();
                if (       (prevChar == '(' && curChar == ')')
                        || (prevChar == '[' && curChar == ']')
                        || (prevChar == '{' && curChar == '}')) {
                    //ok
                } else
                    return false;
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
}
