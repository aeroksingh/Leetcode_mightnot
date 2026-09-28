class Solution {
    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int maxFreq = 0;

        for (int c : list) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
        }

        list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                list.add(entry.getKey());
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;

        for (int e : list) {
            ans[i++] = e;
        }

        return ans;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}