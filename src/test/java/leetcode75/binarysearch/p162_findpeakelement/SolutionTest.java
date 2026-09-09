package leetcode75.binarysearch.p162_findpeakelement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsUniquePeak() {
        assertEquals(2, solution.findPeakElement(new int[] {1, 2, 3, 1}));
    }

    @Test
    void findsEitherValidPeak() {
        int peak = solution.findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4});
        assertTrue(peak == 1 || peak == 5);
    }

    @Test
    void handlesSingleElement() {
        assertEquals(0, solution.findPeakElement(new int[] {-10}));
    }
}
