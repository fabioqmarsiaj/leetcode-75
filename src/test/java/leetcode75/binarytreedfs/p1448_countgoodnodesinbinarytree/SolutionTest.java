package leetcode75.binarytreedfs.p1448_countgoodnodesinbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(4, solution.goodNodes(tree(3, 1, 4, 3, null, 1, 5)));
        assertEquals(3, solution.goodNodes(tree(3, 3, null, 4, 2)));
        assertEquals(1, solution.goodNodes(tree(1)));
    }

    @Test
    void comparesNegativeValuesAlongThePath() {
        assertEquals(3, solution.goodNodes(tree(-5, -4, -6, -3)));
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
