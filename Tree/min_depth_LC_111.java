public class min_depth_LC_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
    public static void main(String[] args) {
        min_depth_LC_111 obj = new min_depth_LC_111();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        int res = obj.minDepth(root);
        System.out.println(res);
    }
}
