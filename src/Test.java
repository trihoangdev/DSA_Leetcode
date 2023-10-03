import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node l2 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        l1.next = n2;
        n2.next = n3;

        l2.next = n5;
        n5.next = n6;

        System.out.println("Before reverse, head l1: " + l1.value);
        System.out.println("Before reverse, head l2: " + l2.value);


        l1 = reverseList(l1);
        l2 = reverseList(l2);

        System.out.println("After reverse, head l1: " + l1.value);
        System.out.println("After reverse, head l2: " + l2.value);

        printLinkedList(l1);
        printLinkedList(l2);

    }

    public static class Node {
        int value;
        Node next; //next mặc định trỏ vào null

        //constructor
        public Node(int value) {
            this.value = value;
        }
    }
    public static Node reverseList(Node head){
        Node next,prev = null;
        Node cur = head;

        while(cur!=null)
        {
            //dịch next ra sau
            next = cur.next;
            //đảo chiều
            cur.next = prev;
            //dịch prev lên
            prev = cur;
            //dịch cur lên
            cur = next;
        }
        return prev;
    }

    public static void printLinkedList(Node head) {
        if (head == null)
            System.out.println("List is empty");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null)
                    System.out.print("->");
                else
                    System.out.println();
            }
        }
    }

    public static Node findLast(Node node) {
        while (node.next != null)
            node = node.next;
        return node;
    }
}
