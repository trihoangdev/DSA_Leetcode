public class _2_Add_Two_Numbers {
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

    /**
     * Hàm dùng để add 2 list lại
     *
     * @param l1 list 1
     * @param l2 list 2
     * @return list mới là tổng của 2 list trên
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            // cả l1 và l2 != null
            if ((l1.val + l2.val + temp.val) <= 9) {
                temp.val += l1.val + l2.val;
                if (l1.next != null || l2.next != null) {
                    temp = addToTail(temp, 0);
                    temp = temp.next;
                }
            } else {
                temp.val = (l1.val + l2.val + temp.val) % 10;
                temp = addToTail(temp, 1);
                temp = temp.next;
            }
            // DK lap
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null)
            while (l1 != null) {
                // Chỉ có l1 khác null
                // temp + l1 <= 9
                if ((temp.val + l1.val) <= 9) {
                    temp.val += l1.val;
                    if (l1.next != null) {
                        temp = addToTail(temp, 0);
                        temp = temp.next;
                    }
                }
                // temp + l1 > 0
                else {
                    temp.val = (temp.val + l1.val) % 10;
                    temp = addToTail(temp, 1);
                    temp = temp.next;
                }
                l1 = l1.next;
            }
        else
            while (l2 != null) {
                // Chỉ có l2 khác null
                if ((temp.val + l2.val) <= 9) {
                    temp.val += l2.val;
                    if (l2.next != null) {
                        temp = addToTail(temp, 0);
                        temp = temp.next;
                    }
                }
                // temp + l1 > 0
                else {
                    temp.val = (temp.val + l2.val) % 10;
                    temp = addToTail(temp, 1);
                    temp = temp.next;
                }
                l2 = l2.next;
            }
        return head;
    }

    /**
     * Hàm dùng để add node vào cuối => Đã check
     *
     * @param head  node đầu tiên
     * @param value giá trị cần add
     * @return list mới đã có node
     */
    public static ListNode addToTail(ListNode head, int value) {
        ListNode ListNode = new ListNode(value);
        if (head == null)
            return ListNode;
        // B1: Tim Last
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        // B2: Gan last.next = ListNode
        temp.next = ListNode;
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

        ListNode l1 = new ListNode(3);
        l1 = addToTail(l1, 7);

        ListNode l2 = new ListNode(9);
        l2 = addToTail(l2, 2);

        printLinkedList(addTwoNumbers(l1, l2));
    }
}
