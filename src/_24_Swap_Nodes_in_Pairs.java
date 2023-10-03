public class _24_Swap_Nodes_in_Pairs {
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

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null && prev != null) {
            //swap
            ListNode temp = new ListNode(cur.val);
            cur.val = prev.val;
            prev.val = temp.val;
            //dk lap
            if(prev.next.next == null)
                break;
            prev = prev.next.next;
            cur = prev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        addNote(n, 2);
        addNote(n, 3);
        addNote(n, 4);
        addNote(n, 5);
        showList(n);
        n = swapPairs(n);
        showList(n);
    }
}
