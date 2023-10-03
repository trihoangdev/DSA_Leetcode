

public class _1721_Swapping_Nodes_in_a_Linked_List {
    public static class ListNode {
        int val;
        ListNode next; //next mặc định trỏ vào null

        //constructor
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode node1 = head,node2 = head,temp = head;

        //tim node 1
        while(k>1){
            node1 = node1.next;
            temp = temp.next;
            k--;
        }
        //tim node 2:
        //chajy node temp đến cuối thì node2 là node ở vtri cần tìm
        //vd: length = 5, k = 2 => node2 ở vị trí thứ 5-2+1 = 3(ban đầu node2ở vtri 1)
        while(temp.next!=null)
        {
            temp = temp.next;
            node2 = node2.next;
        }

        //swap
        int t = node1.val;
        node1.val = node2.val;
        node2.val = t;
        return head;
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

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node = addToTail(node, 2);
        node = addToTail(node, 3);
        node = addToTail(node, 4);
        node = addToTail(node, 5);
        printLinkedList(node);
        node = swapNodes(node, 2);
        printLinkedList(node);
    }
}
