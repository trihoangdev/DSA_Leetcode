public class _876_Middle_of_the_Linked_List {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode node = head;
        //Tim length cua list
        int count = 1;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        int index = 0;
        node = head;
        while (node != null) {
            if (index == count / 2)
                return node;
            node = node.next;
            index++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printList(n1);
        n1 = middleNode(n1);
        printList(n1);
    }

    private static void printList(ListNode head) {
        if (head == null)
            System.out.println("List is empty");
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null)
                System.out.print("->");
            else
                System.out.println();
        }
    }
}
