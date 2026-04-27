// LeetCode 993
import java.util.LinkedList;
import java.util.Queue;

public class Cousins_in_binary_tree_LC_933 {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode parentX = null, parentY = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    if (node.left.val == x) parentX = node;
                    if (node.left.val == y) parentY = node;
                    q.add(node.left);
                }

                if (node.right != null) {
                    if (node.right.val == x) parentX = node;
                    if (node.right.val == y) parentY = node;
                    q.add(node.right);
                }
            }

            if (parentX != null && parentY != null) {
                return parentX != parentY;
            }

            if (parentX != null || parentY != null) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Cousins_in_binary_tree_LC_933 obj = new Cousins_in_binary_tree_LC_933();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(obj.isCousins(root, 4, 5));
    }
}
