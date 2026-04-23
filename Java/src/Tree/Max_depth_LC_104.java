package Tree;
public class Max_depth_LC_104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        Max_depth_LC_104 obj = new Max_depth_LC_104();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int res = obj.maxDepth(root);
        System.out.println(res);
    }
}