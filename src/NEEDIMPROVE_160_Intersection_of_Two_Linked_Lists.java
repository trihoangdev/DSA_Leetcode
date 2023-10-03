public class NEEDIMPROVE_160_Intersection_of_Two_Linked_Lists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode addToTail(ListNode head, int value) {
        ListNode node = new ListNode(value);
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
    /*public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    }*/
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

    public static void main(String[] args) {
        ListNode n = new ListNode(4);
        n = addToTail(n,1);
        n = addToTail(n,8);
        n = addToTail(n,4);
        n = addToTail(n,5);

        ListNode m = new ListNode(5);
        m = addToTail(m,6);
        m = addToTail(m,1);
        m = addToTail(m,8);
        m = addToTail(m,4);
        m = addToTail(m,5);
        printLinkedList(n);
        printLinkedList(m);
        //ListNode l = getIntersectionNode(n,m);
//        printLinkedList(l);
    }
}
