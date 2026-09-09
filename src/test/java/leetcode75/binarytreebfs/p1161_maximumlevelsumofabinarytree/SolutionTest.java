package leetcode75.binarytreebfs.p1161_maximumlevelsumofabinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(2, solution.maxLevelSum(tree(1, 7, 0, 7, -8, null, null)));
        assertEquals(2, solution.maxLevelSum(tree(989, null, 10250, 98693, -89388, null, null, null, -32127)));
    }

    @Test
    void choosesSmallestLevelWhenSumsTie() {
        assertEquals(1, solution.maxLevelSum(tree(2, 1, 1)));
    }

    private static TreeNode tree(Integer... values) {
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        for (int i = 1; i < values.length && !nodes.isEmpty();) {
            TreeNode node = nodes.remove();
            if (values[i] != null) nodes.add(node.left = new TreeNode(values[i]));
            i++;
            if (i < values.length && values[i] != null) nodes.add(node.right = new TreeNode(values[i]));
            i++;
        }
        return root;
    }
}
