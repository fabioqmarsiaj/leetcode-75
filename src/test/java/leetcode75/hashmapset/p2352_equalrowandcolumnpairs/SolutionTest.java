package leetcode75.hashmapset.p2352_equalrowandcolumnpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void countsEqualRowAndColumnPairs() {
        assertEquals(1, solution.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
        assertEquals(3, solution.equalPairs(new int[][]{
                {3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
        assertEquals(1, solution.equalPairs(new int[][]{{42}}));
    }
}
