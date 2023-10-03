public class _86_Partition_List {
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

    public static ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode();//lưu giá trị <x , list1 là list trả về
        ListNode l1 = list1;
        ListNode list2 = new ListNode();
        ListNode l2 = list2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x)
                l1 = addToTail(l1, cur.val);
            else
                l2 = addToTail(l2, cur.val);
            cur = cur.next;
        }
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = l2.next;
        return list1.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l = addToTail(l, 4);
        l = addToTail(l, 3);
        l = addToTail(l, 2);
        l = addToTail(l, 5);
        l = addToTail(l, 2);
        show(l);
        l = partition(l, 3);
        show(l);
    }
}
