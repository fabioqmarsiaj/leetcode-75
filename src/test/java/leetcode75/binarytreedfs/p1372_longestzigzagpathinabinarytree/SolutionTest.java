package leetcode75.binarytreedfs.p1372_longestzigzagpathinabinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        TreeNode first = new TreeNode(1);
        first.right = new TreeNode(1);
        first.right.left = new TreeNode(1);
        first.right.right = new TreeNode(1);
        first.right.right.left = new TreeNode(1);
        first.right.right.right = new TreeNode(1);
        first.right.right.left.right = new TreeNode(1);
        first.right.right.left.right.right = new TreeNode(1);
        assertEquals(3, solution.longestZigZag(first));

        TreeNode second = new TreeNode(1);
        second.left = new TreeNode(1);
        second.right = new TreeNode(1);
        second.left.right = new TreeNode(1);
        second.left.right.left = new TreeNode(1);
        second.left.right.right = new TreeNode(1);
        second.left.right.left.right = new TreeNode(1);
        assertEquals(4, solution.longestZigZag(second));
        assertEquals(0, solution.longestZigZag(new TreeNode(1)));
    }

    @Test
    void straightPathOnlyHasOneZigZagEdge() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        assertEquals(1, solution.longestZigZag(root));
    }
}
