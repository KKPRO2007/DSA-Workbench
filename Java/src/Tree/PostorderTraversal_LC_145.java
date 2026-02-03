package Tree;
import java.util.*;
public class PostorderTraversal_LC_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null)
            return ls;
        ls.addAll(postorderTraversal(root.left));
        ls.addAll(postorderTraversal(root.right));
        ls.add(root.val);
        return ls;
    }

    public static void main(String[] args) {
        PostorderTraversal_LC_145 obj = new PostorderTraversal_LC_145();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = obj.postorderTraversal(root);
        for (int x : res)
            System.out.print(x + " ");
    }
}