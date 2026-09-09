package leetcode75.bitmanipulation.p136_singlenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }

    @Test
    void supportsNegativeUniqueNumber() {
        assertEquals(-7, solution.singleNumber(new int[]{3, -7, 3}));
    }
}
