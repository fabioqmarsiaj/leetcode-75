package leetcode75.heappriorityqueue.p2462_totalcosttohirekworkers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void hiresAcrossMultipleSessions() {
        assertEquals(11L, solution.totalCost(
                new int[] {17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4));
    }

    @Test
    void handlesOverlappingCandidateWindows() {
        assertEquals(4L, solution.totalCost(new int[] {1, 2, 4, 1}, 3, 3));
    }

    @Test
    void resolvesEqualCostsByIndex() {
        assertEquals(10L, solution.totalCost(new int[] {5, 5, 5}, 2, 1));
    }
}
