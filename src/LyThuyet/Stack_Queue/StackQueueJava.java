package LyThuyet.Stack_Queue;

import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer i : myStack)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        for (Integer i : myStack)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        for (Integer i : myStack)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        for (Integer i : myStack)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("Is empty: " + myStack.empty());
    }
}
