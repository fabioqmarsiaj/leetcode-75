package leetcode75.binarysearch.p2300_successfulpairsofspellsandpotions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void countsSuccessfulPairs() {
        assertArrayEquals(new int[] {4, 0, 3}, solution.successfulPairs(
                new int[] {5, 1, 3}, new int[] {1, 2, 3, 4, 5}, 7));
    }

    @Test
    void countsPairsWithRepeatedPotions() {
        assertArrayEquals(new int[] {2, 0, 2}, solution.successfulPairs(
                new int[] {3, 1, 2}, new int[] {8, 5, 8}, 16));
    }

    @Test
    void handlesSuccessAtExactLongProduct() {
        assertArrayEquals(new int[] {1}, solution.successfulPairs(
                new int[] {100_000}, new int[] {100_000}, 10_000_000_000L));
    }
}
