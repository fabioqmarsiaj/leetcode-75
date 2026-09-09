package leetcode75.dynamicprogramming1d.p1137_nthtribonaccinumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(4, solution.tribonacci(4));
        assertEquals(1_389_537, solution.tribonacci(25));
    }

    @Test
    void zeroHasNoPrecedingTerms() {
        assertEquals(0, solution.tribonacci(0));
    }
}
