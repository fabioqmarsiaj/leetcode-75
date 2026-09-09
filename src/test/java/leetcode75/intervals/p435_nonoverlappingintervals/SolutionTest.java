package leetcode75.intervals.p435_nonoverlappingintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(1, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        assertEquals(2, solution.eraseOverlapIntervals(
                new int[][]{{1, 2}, {1, 2}, {1, 2}}));
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

    @Test
    void keepsSingleInterval() {
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{-5, 5}}));
    }
}
