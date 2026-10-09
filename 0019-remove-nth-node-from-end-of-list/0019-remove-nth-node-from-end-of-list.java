
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
       
        // Return original list if it's empty or k is negatively out of bounds
        if (head == null || k < 0) {
            return head;
        }

        // Dummy node points to head. This handles cases where the head itself must be removed.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer k + 1 positions ahead to maintain a gap
        for (int i = 0; i < k; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                // If we reach null before completing k+1 steps, k is out of bounds
                return head;
            }
        }

        // Move both pointers at the same speed until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // slow is now guaranteed to be the node immediately preceding the target
        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        return dummy.next;
    
    }
}