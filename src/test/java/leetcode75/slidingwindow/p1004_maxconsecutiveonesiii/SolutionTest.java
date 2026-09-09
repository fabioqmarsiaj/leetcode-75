package leetcode75.slidingwindow.p1004_maxconsecutiveonesiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsLongestRunAfterFlips() {
        assertEquals(6, solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        assertEquals(10, solution.longestOnes(
                new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        assertEquals(0, solution.longestOnes(new int[]{0, 0}, 0));
    }
}
