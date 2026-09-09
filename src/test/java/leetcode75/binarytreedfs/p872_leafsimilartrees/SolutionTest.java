package leetcode75.binarytreedfs.p872_leafsimilartrees;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        TreeNode first = tree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        TreeNode second = tree(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        assertTrue(solution.leafSimilar(first, second));
        assertFalse(solution.leafSimilar(tree(1, 2, 3), tree(1, 3, 2)));
    }

    @Test
    void singleEqualLeavesAreSimilar() {
        assertTrue(solution.leafSimilar(new TreeNode(42), new TreeNode(42)));
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
