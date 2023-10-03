public class _19_Remove_Nth_Node_From_End_of_List {

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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        //count = 5
        int nodeTh = count - n;
        temp = head;
        count = 0;
        ListNode prev = null;
        while (temp != null) {
            if (count == nodeTh) {
                if (prev == null)
                    head = temp.next;
                else
                    prev.next = temp.next;
            }
            ++count;
            prev = temp;
            temp = temp.next;
        }
        return head;
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

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        addNote(n, 2);
        /*addNote(n, 3);
        addNote(n, 4);
        addNote(n, 5);*/
        showList(n);
         n = removeNthFromEnd(n, 1);
        showList(n);
    }
}
