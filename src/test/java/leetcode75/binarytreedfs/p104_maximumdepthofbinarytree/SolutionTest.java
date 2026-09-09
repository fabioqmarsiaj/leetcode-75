package leetcode75.binarytreedfs.p104_maximumdepthofbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(3, solution.maxDepth(tree(3, 9, 20, null, null, 15, 7)));
        assertEquals(2, solution.maxDepth(tree(1, null, 2)));
    }

    @Test
    void emptyTreeHasZeroDepth() {
        assertEquals(0, solution.maxDepth(null));
    }

    private static TreeNode tree(Integer... values) {
        if (values.length == 0 || values[0] == null) return null;
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
