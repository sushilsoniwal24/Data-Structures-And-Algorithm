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
    // ------------------------------------------------------------------------------------------------

    /*** (2) Reorder List. ***/
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
    // ------------------------------------------------------------------------------------------------

    /*** (3) Reverse Linked List II. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/reverse-linked-list-ii/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode prev = null, current = head;
        int count = 1;
        while (count != left) {
            prev = current;
            current = current.next;
            count++;
        }

        ListNode start = current;
        while (count != right) {
            current = current.next;
            count++;
        }

        ListNode rest = current.next;
        current.next = null;

        ListNode newHead = reverseList(start);

        if (prev != null) {
            prev.next = newHead;
        }

        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = rest;

        if (left == 1) {
            return newHead;
        }
        return head;
    }
    // ------------------------------------------------------------------------------------------------

    /*** (4) Remove Nth Node From End of List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * (2) Time Complexity = O(n).
     * (3) Space Complexity = O(1).
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head, second = head;
        for (int index = 0; index < n; index++) {
            first = first.next;
        }

        if (first == null) {
            return head.next;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return head;
    }
    // ------------------------------------------------------------------------------------------------

    // Middle Of The Linked List.
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Reverse The Linked List.
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
