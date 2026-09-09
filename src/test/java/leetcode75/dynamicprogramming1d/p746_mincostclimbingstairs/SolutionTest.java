package leetcode75.dynamicprogramming1d.p746_mincostclimbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, solution.minCostClimbingStairs(
                new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void zeroCostStepsRequireNoPayment() {
        assertEquals(0, solution.minCostClimbingStairs(new int[]{0, 0}));
    }
}
