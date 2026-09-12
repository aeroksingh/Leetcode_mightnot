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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;

        int size = 0;

        while(curr != null){
            size++;
            curr = curr.next;
        }
        int[] ans = new int[size];
        for(int i=0;i<size;i++){
            ans[i] = temp.val;
            temp=temp.next;
        }
        return helper(ans,0,size-1);
        
    }
    private TreeNode helper(int[] nums,int left, int right){
        if(left>right) return null;

        int mid = left + (right-left)/2;

        TreeNode curr = new TreeNode(nums[mid]);

        curr.left = helper(nums,left,mid-1);
        curr.right = helper(nums,mid+1,right);

        return curr;
    }
}