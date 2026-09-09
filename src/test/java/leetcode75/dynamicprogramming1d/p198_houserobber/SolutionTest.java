package leetcode75.dynamicprogramming1d.p198_houserobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void robsTheOnlyHouse() {
        assertEquals(5, solution.rob(new int[]{5}));
    }
}
