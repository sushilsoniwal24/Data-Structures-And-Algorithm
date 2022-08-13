package LinkedList.Linked_List_Questions;

public class Easy_LLQ {
    public ListNode head;

    /*
     * (1) Link:-
     * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-
     * integer/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public static int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }

    /*
     * (1) Link:- https://leetcode.com/problems/reverse-linked-list/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    /* Node Structure. */
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
