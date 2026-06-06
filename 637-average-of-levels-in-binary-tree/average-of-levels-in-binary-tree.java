class Solution {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            List<Double> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                double a = curr.val;
                list.add(a);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            double sum = valadd(list);

            res.add(sum / size);
        }

        return res;
    }

    private double valadd(List<Double> list) {

        double sum = 0.0;

        for (Double e : list) {
            sum += e;
        }

        return sum;
    }
}