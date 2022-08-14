package LinkedList.Linked_List_Questions;

public class Easy_LLQ {
    public ListNode head;

    /*** (1) Convert Binary Number in a Linked List to Integer. ***/
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

    /*** (2) Reverse A Linked List. ***/
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

    /*** (3) Delete A Node In A Linked List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/delete-node-in-a-linked-list/
     * (2) Time Complexity = O(1).
     * (3) Space Complexity = O(1).
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /*** (4) Middle Of A Linked List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/middle-of-the-linked-list/
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /*** (5) Count Nodes Of A Linked List. ***/
    /*
     * (1) Link:- https://bit.ly/3hcEOou
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public int getCount(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /*** (6) Linked List Length Is Even Or Odd. ***/
    /*
     * (1) Link:- https://bit.ly/3HldJtX
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public int isLengthEvenOrOdd(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            return 1; // Odd.
        }
        return 0; // Even.
    }

    /*** (7) Linked List Has Cycle Or Not. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/linked-list-cycle/
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    /*** (8) Palindrome Linked List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/palindrome-linked-list/
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Odd Length.
        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    // To Reverse List From Slow Till End.
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /*** (9) Remove Duplicates from Sorted List. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null) {
                break;
            } else if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    /*** (10) Remove Linked List Elements. ***/
    /*
     * (1) Link:- https://leetcode.com/problems/remove-linked-list-elements/
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    /*** (11) Finding middle element in a linked list. ***/
    /*
     * (1) Link:- https://bit.ly/3C52J52
     * (2) Time Complexity = O(N).
     * (3) Space Complexity = O(1).
     */
    public int getMiddle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        int ans = slow.val;
        return ans;
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
