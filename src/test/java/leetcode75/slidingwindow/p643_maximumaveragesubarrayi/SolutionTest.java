package leetcode75.slidingwindow.p643_maximumaveragesubarrayi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsMaximumAverage() {
        assertEquals(12.75, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 1e-5);
        assertEquals(5.0, solution.findMaxAverage(new int[]{5}, 1), 1e-5);
        assertEquals(-2.5, solution.findMaxAverage(new int[]{-3, -2}, 2), 1e-5);
    }
}
