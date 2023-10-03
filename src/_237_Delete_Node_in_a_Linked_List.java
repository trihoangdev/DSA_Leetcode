
public class _237_Delete_Node_in_a_Linked_List {

    public static class ListNode {
        int val;
        ListNode next; //next mặc định trỏ vào null

        //constructor
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addToTail(ListNode head, int val) {
        ListNode node = new ListNode(val);
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

    public static void printLinkedList(ListNode head) {
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

    public static void deleteNode(ListNode node) {
        node.val = node.next.val; //copy du lieu
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node = addToTail(node, 2);
        node = addToTail(node, 3);
        node = addToTail(node, 4);
        node = addToTail(node, 5);
        printLinkedList(node);

        printLinkedList(node);
    }
}
