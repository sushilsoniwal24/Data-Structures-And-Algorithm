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
