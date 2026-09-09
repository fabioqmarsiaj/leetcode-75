package leetcode75.intervals.p452_minimumnumberofarrowstoburstballoons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(2, solution.findMinArrowShots(
                new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
        assertEquals(4, solution.findMinArrowShots(
                new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
        assertEquals(2, solution.findMinArrowShots(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
    }

    @Test
    void burstsNestedBalloonsWithOneArrow() {
        assertEquals(1, solution.findMinArrowShots(new int[][]{{1, 10}, {2, 3}, {3, 4}}));
    }
}
