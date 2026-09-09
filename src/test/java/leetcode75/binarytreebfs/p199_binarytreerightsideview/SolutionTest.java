package leetcode75.binarytreebfs.p199_binarytreerightsideview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(List.of(1, 3, 4), solution.rightSideView(tree(1, 2, 3, null, 5, null, 4)));
        assertEquals(List.of(1, 3, 4, 5), solution.rightSideView(tree(1, 2, 3, 4, null, null, null, 5)));
        assertEquals(List.of(1, 3), solution.rightSideView(tree(1, null, 3)));
        assertEquals(List.of(), solution.rightSideView(null));
    }

    @Test
    void returnsTheOnlyNode() {
        assertEquals(List.of(8), solution.rightSideView(new TreeNode(8)));
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
