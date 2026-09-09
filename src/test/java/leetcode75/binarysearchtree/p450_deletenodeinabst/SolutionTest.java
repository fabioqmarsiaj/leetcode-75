package leetcode75.binarysearchtree.p450_deletenodeinabst;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[] {2, 4, 5, 6, 7}, inorder(solution.deleteNode(exampleTree(), 3)));
        assertArrayEquals(new int[] {2, 3, 4, 5, 6, 7}, inorder(solution.deleteNode(exampleTree(), 0)));
        assertNull(solution.deleteNode(null, 0));
    }

    @Test
    void deletesTheOnlyNode() {
        assertNull(solution.deleteNode(new TreeNode(1), 1));
    }

    private static TreeNode exampleTree() {
        return new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));
    }

    private static int[] inorder(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        traverse(root, values);
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void traverse(TreeNode node, List<Integer> values) {
        if (node == null) return;
        traverse(node.left, values);
        values.add(node.val);
        traverse(node.right, values);
    }
}
