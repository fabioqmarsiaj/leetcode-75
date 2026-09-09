package leetcode75.binarytreedfs.p437_pathsumiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(3, solution.pathSum(tree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1), 8));
        assertEquals(3, solution.pathSum(tree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1), 22));
    }

    @Test
    void emptyTreeHasNoPaths() {
        assertEquals(0, solution.pathSum(null, 0));
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
