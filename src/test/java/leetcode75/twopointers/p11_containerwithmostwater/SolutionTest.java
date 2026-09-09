package leetcode75.twopointers.p11_containerwithmostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsMaximumContainerArea() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
        assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
    }
}
