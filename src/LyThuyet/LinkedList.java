package LyThuyet;

public class LinkedList {

    public static class Node {
        int value;
        Node next; //next mặc định trỏ vào null

        //constructor
        public Node(int value) {
            this.value = value;
        }
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

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null)
            newNode.next = headNode;
        return newNode;
    }

    public static Node addToTail(Node head, int value) {
        Node node = new Node(value);
        if (head == null)
            return node;
        //B1: Tim Last
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        //B2: Gan last.next = node
        temp.next = node;
        return head;
    }

    public static Node addToIndex(Node head, int val, int index) {
        if (index == 0) {
            return addToHead(head, val);
        } else {
            Node node = new Node(val);
            //B1: Tim vi tri can them
            Node cur = head;
            int count = 0;
            while (cur != null) {
                count++;
                if (count == index) {
                    //thuc hien add
                    node.next = cur.next;
                    cur.next = node;
                    break;
                }
                cur = cur.next;
            }
        }
        return head;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            headNode = headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node head) {
        if (head == null)
            return null;
        Node lastNode = head;
        Node prevNode = null;
        //B1: xac dinh Last va Prev
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        //mảng chỉ có 1 phần tử => lastNode.next = NUlL=> ko có prevNode
        if (prevNode == null)
            return null;
        else
            prevNode.next = null;
        return head;
    }

    public static Node removeAtIndex(Node head, int index) {
        if (head == null || index < 0)
            return null;
        if (index == 0)
            return removeAtHead(head);

        Node cur = head;
        Node prev = null;
        int count = 0;
        while (cur != null) {
            if (count == index) {
                //Remove cur
                prev.next = cur.next;
                break;
            }
            prev = cur;
            cur = cur.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        /*n1 = addToTail(n1,4);
        n1 = addToTail(n1,5);
        n1 = addToTail(n1,6);*/

        printLinkedList(n1);
        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);

    }
}
