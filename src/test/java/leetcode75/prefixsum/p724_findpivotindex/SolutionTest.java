package leetcode75.prefixsum.p724_findpivotindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsLeftmostPivotIndex() {
        assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(-1, solution.pivotIndex(new int[]{1, 2, 3}));
        assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
        assertEquals(0, solution.pivotIndex(new int[]{0}));
    }
}
