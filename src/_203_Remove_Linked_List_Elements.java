public class _203_Remove_Linked_List_Elements {
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

    public static ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (cur.val == val) {
                if(prev == null)
                   {
                    head = cur.next;
                   }
                else
                    prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
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
        ListNode n = new ListNode(7);
        addNote(n, 7);
        addNote(n, 7);
        System.out.println("BEFORE:");
        showList(n);
        n = removeElements(n, 7);
        System.out.println("AFTER:");
        showList(n);
    }
}
