import java.util.Arrays;

public class _148_Sort_List {

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

    public static ListNode sortList(ListNode head) {
        ListNode curNode = head;

        //find length of list
        int length = 0;
        while (curNode != null) {
            length++;
            curNode = curNode.next;
        }
        int[] arr = new int[length];
        int i = 0;
        curNode = head;
        while (curNode != null) {
            arr[i] = curNode.val;
            curNode = curNode.next;
            i++;
        }
        Arrays.sort(arr);
        curNode = head;
        i = 0;
        while (curNode != null) {
            curNode.val = arr[i];
            i++;
            curNode = curNode.next;
        }
        return head;
    }


    public static void addNewNodeAfter(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        ListNode curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public static void showListNode(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val);
            if (curNode.next != null)
                System.out.print("->");
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        addNewNodeAfter(head, 3);
        addNewNodeAfter(head, 5);
        addNewNodeAfter(head, 4);
        addNewNodeAfter(head, 0);
        sortList(head);
        showListNode(head);
    }
}
