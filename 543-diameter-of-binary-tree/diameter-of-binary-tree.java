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
    private int levels(TreeNode root){
        if(root == null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);
        return 1 + Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int myD = levels(root.left)+ levels(root.right);
        int left =  diameterOfBinaryTree(root.left);
        int right =  diameterOfBinaryTree(root.right);
        return Math.max(myD,Math.max(left,right));
        
    }
}