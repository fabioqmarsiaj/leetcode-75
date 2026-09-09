package leetcode75.bitmanipulation.p338_countingbits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }

    @Test
    void zeroIncludesItsOwnBitCount() {
        assertArrayEquals(new int[]{0}, solution.countBits(0));
    }
}
