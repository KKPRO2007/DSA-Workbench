public class FindMaxMinInTree {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root == null) return;

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        FindMaxMinInTree obj = new FindMaxMinInTree();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(25);

        obj.dfs(root);
        System.out.println("Max: " + obj.max);
        System.out.println("Min: " + obj.min);
    }
}