public class Codec {

    StringBuilder sb;
    int index;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        dfs(root);
        return sb.toString();
    }
    private void dfs(TreeNode root) {
        if(root == null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        dfs(root.left);
        dfs(root.right);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        return buildTree(arr);
    }
    private TreeNode buildTree(String[] arr) {
        if(arr[index].equals("N")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index++;
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }
}