class Solution {
    public int kthSmallest(TreeNode root, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            pq.add(curr.val);

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        while (k > 1) {
            pq.poll();
            k--;
        }

        return pq.poll();
    }
}