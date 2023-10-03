import java.util.List;

public class NEEDIMPROVE_328_Odd_Even_Linked_List {
    public static class ListNode {
        int val;
        ListNode next; //next mặc định trỏ vào null

        public ListNode() {
        }

        //constructor

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addToTail(ListNode head, int val) {
        ListNode node = new ListNode(val);
        if (head == null)
            return node;
        //B1: Tim Last
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        //B2: Gan last.next = node
        temp.next = node;
        return head;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null)
            System.out.println("List is empty");
        else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null)
                    System.out.print("->");
                else
                    System.out.println();
            }
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode nodeHead = head;
        ListNode oddList = new ListNode();
        ListNode evenList = new ListNode();
        int count = 1;
        while (nodeHead != null) {
            if (count % 2 != 0)
                oddList = addToTail(oddList, nodeHead.val);
            else
                evenList = addToTail(evenList,nodeHead.val);
            count++;
            nodeHead = nodeHead.next;
        }
        ListNode l1 = oddList;
        while(l1.next!=null)
            l1 = l1.next;
        l1.next = evenList.next;
        return oddList.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l = addToTail(l, 2);
        l = addToTail(l, 3);
        l = addToTail(l, 4);
        l = addToTail(l, 5);
        printLinkedList(l);
        l = oddEvenList(l);
        printLinkedList(l);
    }
}
