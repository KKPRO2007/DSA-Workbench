public class Count_tree_node_LC_222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        Count_tree_node_LC_222 obj = new Count_tree_node_LC_222();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int res = obj.countNodes(root);
        System.out.println(res);
    }
}
