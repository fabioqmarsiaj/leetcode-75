package leetcode75.binarytreedfs.p236_lowestcommonancestorofabinarytree;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        TreeNode root = exampleTree();
        assertSame(root, solution.lowestCommonAncestor(root, root.left, root.right));
        assertSame(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right.right));

        TreeNode small = new TreeNode(1, new TreeNode(2), null);
        assertSame(small, solution.lowestCommonAncestor(small, small, small.left));
    }

    @Test
    void findsAncestorInASkewedTree() {
        TreeNode bottom = new TreeNode(4);
        TreeNode middle = new TreeNode(3, bottom, null);
        TreeNode root = new TreeNode(2, middle, null);
        assertSame(middle, solution.lowestCommonAncestor(root, middle, bottom));
    }

    private static TreeNode exampleTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        return root;
    }
}
