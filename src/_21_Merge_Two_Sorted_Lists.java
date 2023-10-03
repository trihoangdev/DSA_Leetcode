import java.util.List;

public class _21_Merge_Two_Sorted_Lists {
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

    public static ListNode addNote(ListNode head, int value) {
        ListNode ListNode = new ListNode(value);
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = ListNode;
        return head;
    }

    public static void showList(ListNode head) {
        if (head == null)
            System.out.println("list is empty");
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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode i1 = l1;
        ListNode i2 = l2;
        ListNode i = new ListNode();
        while (i1 != null && i2 != null) {
            if (i1.val <= i2.val) {
                i = addToTail(i, i1.val);
                i1 = i1.next;
            } else {
                i = addToTail(i, i2.val);
                i2 = i2.next;
            }

        }
        if (i1 != null) {
            //i1 ok
            while (i1 != null) {
                i = addToTail(i, i1.val);
                i1 = i1.next;
            }
        } else {
            //i2 ok
            while (i2 != null) {
                i = addToTail(i, i2.val);
                i2 = i2.next;
            }
        }
        return i.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        addNote(l1, 2);
        addNote(l1, 4);
        ListNode l2 = new ListNode(1);
        addNote(l2, 3);
        addNote(l2, 4);
        showList(l1);
        showList(l2);

        ListNode l = mergeTwoLists(l1, l2);
        showList(l);
    }
}
