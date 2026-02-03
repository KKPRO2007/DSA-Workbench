package Tree;
import java.util.*;
public class PreorderTraversal_LC_144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null)
            return ls;
        ls.add(root.val);
        ls.addAll(preorderTraversal(root.left));
        ls.addAll(preorderTraversal(root.right));
        return ls;
    }

    public static void main(String[] args) {
        PreorderTraversal_LC_144 obj = new PreorderTraversal_LC_144();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = obj.preorderTraversal(root);
        for (int x : res)
            System.out.print(x + " ");
    }
}