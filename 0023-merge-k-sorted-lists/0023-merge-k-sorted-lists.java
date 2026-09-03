/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode node = lists[i];
            while(node != null){
                res.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(res);

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int e: res){
            temp.next = new ListNode(e);
            temp = temp.next;
        }
        return dummy.next;
    }
}
