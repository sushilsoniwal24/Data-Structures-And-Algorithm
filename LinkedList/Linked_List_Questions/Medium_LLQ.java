package LinkedList.Linked_List_Questions;

public class Medium_LLQ {
    public ListNode head;

    /*** (1) Linked List Cycle II. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/linked-list-cycle-ii/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    /*** (1) Reorder List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/reorder-list/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);

        ListNode head1 = head;
        ListNode head2 = reverseList(mid);

        while (head1 != null && head2 != null) {
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }

        if (head1 != null) {
            head1.next = null;
        }
    }

    // To Get Middle Of The Linked List.
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Reverse List From Mid Till End.
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
