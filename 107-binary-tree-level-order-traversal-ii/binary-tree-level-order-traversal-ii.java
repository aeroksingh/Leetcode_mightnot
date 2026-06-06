
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();

        if(root == null) return res;   

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                list.add(curr.val);

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}