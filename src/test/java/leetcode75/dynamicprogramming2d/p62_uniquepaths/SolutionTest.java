package leetcode75.dynamicprogramming2d.p62_uniquepaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(28, solution.uniquePaths(3, 7));
        assertEquals(3, solution.uniquePaths(3, 2));
    }

    @Test
    void startIsDestinationInSingleCellGrid() {
        assertEquals(1, solution.uniquePaths(1, 1));
    }
}
