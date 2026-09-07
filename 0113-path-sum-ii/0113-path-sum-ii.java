class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, new ArrayList<>(), targetSum);
        return res;
    }

    private void helper(TreeNode root, ArrayList<Integer> list, int target) {

        // No node
        if (root == null) {
            return;
        }

        list.add(root.val);
        target -= root.val;

        if (root.left == null && root.right == null && target == 0) {
            res.add(new ArrayList<>(list));
        }

        helper(root.left, list, target);

        helper(root.right, list, target);
        list.remove(list.size() - 1);
    }
}