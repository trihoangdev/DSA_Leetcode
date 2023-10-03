public class _92_Reverse_Linked_List_II {
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

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newList = new ListNode();//list mới lưu kết quả
        newList.next = head;
        ListNode prev = newList; //lưu phần tử trước left
        //tìm phần tử trước left
        for (int i = 0; i < left - 1; i++)
            prev = prev.next;
        //tìm phần tử sau right
        ListNode after = prev;
        for(int i= left;i<=right+1;i++)
            after = after.next;
        // tìm left và right
        ListNode leftNode = prev.next;
        ListNode rightNode = leftNode;
        int i = left;
        while(i!=right){
            rightNode = rightNode.next;
            i++;
        }

        //Lưu list cần reverse
        ListNode list1 = new ListNode();
        list1.next = leftNode;
        rightNode.next = null;

        //reversing
        list1 = reverseList(list1.next);

        //Nối list ban đầu vào list đã reverse
        prev.next = list1;

        //Tìm node cuối của list đó
        while(prev.next!=null)
            prev = prev.next;

        //Nối vào phần sau của list ban đầu
        prev.next = after;

        return newList.next;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l = addToTail(l, 2);
        l = addToTail(l, 3);
        l = addToTail(l, 4);
        l = addToTail(l, 5);
        show(l);
        l = reverseBetween(l, 2, 4);
        show(l);
    }
}
