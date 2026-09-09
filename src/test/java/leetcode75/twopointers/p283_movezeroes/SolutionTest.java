package leetcode75.twopointers.p283_movezeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void movesZeroesInPlaceWhilePreservingOrder() {
        int[] first = {0, 1, 0, 3, 12};
        solution.moveZeroes(first);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, first);

        int[] second = {0};
        solution.moveZeroes(second);
        assertArrayEquals(new int[]{0}, second);

        int[] noZeroes = {1, 2, 3};
        solution.moveZeroes(noZeroes);
        assertArrayEquals(new int[]{1, 2, 3}, noZeroes);
    }
}
