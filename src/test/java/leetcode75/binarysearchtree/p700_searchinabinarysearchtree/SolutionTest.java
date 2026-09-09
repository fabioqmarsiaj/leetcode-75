package leetcode75.binarysearchtree.p700_searchinabinarysearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        TreeNode root = exampleTree();
        TreeNode found = solution.searchBST(root, 2);
        assertEquals(2, found.val);
        assertEquals(1, found.left.val);
        assertEquals(3, found.right.val);
        assertNull(solution.searchBST(exampleTree(), 5));
    }

    @Test
    void findsTheRootItself() {
        TreeNode root = exampleTree();
        assertSame(root, solution.searchBST(root, 4));
    }

    private static TreeNode exampleTree() {
        return new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
    }
}
