public class FindMaxInTree {
    public int findMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        int left = findMax(root.left);
        int right = findMax(root.right);

        return Math.max(root.val, Math.max(left, right));
    }

    public static void main(String[] args) {
        FindMaxInTree obj = new FindMaxInTree();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(25);

        System.out.println(obj.findMax(root));
    }
}
