package leetcode75.graphbfs.p1926_nearestexitfromentranceinmaze;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsNearestExit() {
        assertEquals(1, solution.nearestExit(new char[][] {
            {'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}
        }, new int[] {1, 2}));
    }

    @Test
    void findsOnlyReachableExit() {
        assertEquals(2, solution.nearestExit(new char[][] {
            {'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}
        }, new int[] {1, 0}));
    }

    @Test
    void doesNotCountEntranceAsExit() {
        assertEquals(-1, solution.nearestExit(new char[][] {{'.', '+'}}, new int[] {0, 0}));
    }
}
