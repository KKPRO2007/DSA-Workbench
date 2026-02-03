package Tree;
import java.util.*;
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }
    private static void dfs(Node node, int level, List<List<Integer>> result) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        dfs(node.left, level + 1, result);
        dfs(node.right, level + 1, result);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(levelOrder(root));
    }
}