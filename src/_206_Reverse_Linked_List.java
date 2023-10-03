public class _206_Reverse_Linked_List {
    public static class ListNode {
        int val;
        ListNode next; //next mặc định trỏ vào null

        //constructor
        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
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

    public static void show(ListNode head) {
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

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l = addToTail(l, 4);
        l = addToTail(l, 3);
        l = addToTail(l, 2);
        l = addToTail(l, 5);
        l = addToTail(l, 2);
        show(l);
        l = reverseList(l);
        show(l);
    }
}
