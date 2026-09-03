class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (temp != null) {

            int count = 0;
            ListNode groupHead = temp;

            // Find k nodes
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            // Less than k nodes
            if (count < k) {
                curr.next = groupHead;
                break;
            }

            // Reverse current group
            ListNode newHead = reverse(groupHead, temp);

            // Connect reversed group
            curr.next = newHead;

            // groupHead is now the last node
            curr = groupHead;
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode begin, ListNode end) {

        ListNode prev = end;
        ListNode curr = begin;

        while (curr != end) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}