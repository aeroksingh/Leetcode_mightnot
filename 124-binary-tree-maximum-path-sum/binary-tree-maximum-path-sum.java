class Solution {
    static int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE;
        levels(root);
        return maxsum;
    }
    private int levels(TreeNode root){
        if(root == null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);
        int sum = root.val;
        if(left>0){
            sum += left;
        }
        if(right>0){
            sum += right;
        }
        maxsum = Math.max(sum,maxsum);
        return root.val + Math.max(0,Math.max(left,right));
    }

}