package leetcode75.heappriorityqueue.p2542_maximumsubsequencescore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void maximizesScoreForThreeIndices() {
        assertEquals(12L, solution.maxScore(
                new int[] {1, 3, 3, 2}, new int[] {2, 1, 3, 4}, 3));
    }

    @Test
    void maximizesScoreForSingleIndex() {
        assertEquals(30L, solution.maxScore(
                new int[] {4, 2, 3, 1, 1}, new int[] {7, 5, 10, 9, 6}, 1));
    }

    @Test
    void usesAllElementsWhenKEqualsLength() {
        assertEquals(27L, solution.maxScore(new int[] {2, 4, 3}, new int[] {5, 3, 4}, 3));
    }
}
