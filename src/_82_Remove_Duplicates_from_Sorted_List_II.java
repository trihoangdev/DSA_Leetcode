public class _82_Remove_Duplicates_from_Sorted_List_II {
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

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        //Mảng mới lưu những giá trị ko trùng nhau
        ListNode newList = new ListNode();
        newList.next = head; //cho mảng mới nối tiếp vào mảng cũ để lọc
        ListNode cur = newList; //cur tro vao null
        while(cur.next!=null && cur.next.next!=null){
            if(cur.next.val == cur.next.next.val){
                int value = cur.next.val;
                //bỏ qua những node có val = value
                while(cur.next!=null && cur.next.val == value)
                    cur.next = cur.next.next;
            }else
                cur = cur.next;
        }
        return newList.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l = addToTail(l, 2);
        l = addToTail(l, 2);
        l = addToTail(l, 3);
        l = addToTail(l, 4);
        show(l);
        l = deleteDuplicates(l);
        show(l);
    }
}
