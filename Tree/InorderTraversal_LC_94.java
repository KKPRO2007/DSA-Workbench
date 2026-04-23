import java.util.ArrayList;
import java.util.List;

public class InorderTraversal_LC_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null)
            return ls;
        ls.addAll(inorderTraversal(root.left));
        ls.add(root.val);
        ls.addAll(inorderTraversal(root.right));
        return ls;
    }

    public static void main(String[] args) {
        InorderTraversal_LC_94 obj = new InorderTraversal_LC_94();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> res = obj.inorderTraversal(root);
        for (int x : res)
            System.out.print(x + " ");
    }
}
