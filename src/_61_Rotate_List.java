public class _61_Rotate_List {
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

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode cur = head;
        int count = 1;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }

        cur.next = head;
        k = k % count;
        k = count - k;
        while (k != 0) {
            k--;
            cur = cur.next;
        }
        head = cur.next;
        cur.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        l = addToTail(l, 1);
        l = addToTail(l, 2);
        l = addToTail(l, 3);
        l = addToTail(l, 4);
        l = addToTail(l, 5);
//        l = addToTail(l, 6);

        /*show(l);
        l = rotateRight(l, 4);
        show(l);*/
    }
}

