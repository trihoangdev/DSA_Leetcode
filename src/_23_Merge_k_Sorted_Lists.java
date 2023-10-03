public class _23_Merge_k_Sorted_Lists {
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];

        return mergeSort(lists, 0, lists.length - 1);
    }

    public static ListNode mergeSort(ListNode[] lists, int l, int r) {
        //dk dung
        if (l == r)
            return lists[l];
        if (l < r) {
            int k = (l + r) / 2;
            ListNode a1 = mergeSort(lists, l, k);
            ListNode a2 = mergeSort(lists, k + 1, r);

            return merge(a1, a2);
        }
        return null;
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null)
            cur.next = l1;
        else
            cur.next = l2;

        return head.next;
    }


    public static void main(String[] args) {
        ListNode l4 = null;
        ListNode l3 = null;

        ListNode l1 = new ListNode(1);
        addNote(l1, 4);
        addNote(l1, 5);
        ListNode l2 = new ListNode(1);
        addNote(l2, 3);
        addNote(l2, 4);
//        ListNode l3 = new ListNode(2);
        /*addNote(l3, 6);*/
        ListNode[] lists = {l4, l2, l1, l3};


        ListNode l = mergeKLists(lists);
        showList(l);
    }
}
