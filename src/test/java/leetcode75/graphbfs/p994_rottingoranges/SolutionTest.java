package leetcode75.graphbfs.p994_rottingoranges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void rotsAllOrangesInFourMinutes() {
        assertEquals(4, solution.orangesRotting(new int[][] {
            {2, 1, 1}, {1, 1, 0}, {0, 1, 1}
        }));
    }

    @Test
    void reportsUnreachableFreshOrange() {
        assertEquals(-1, solution.orangesRotting(new int[][] {
            {2, 1, 1}, {0, 1, 1}, {1, 0, 1}
        }));
    }

    @Test
    void emptyCellNeedsNoTime() {
        assertEquals(0, solution.orangesRotting(new int[][] {{0}}));
    }
}
