package leetcode75.bitmanipulation.p1318_minimumflipstomakeaorbequaltoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(3, solution.minFlips(2, 6, 5));
        assertEquals(1, solution.minFlips(4, 2, 7));
        assertEquals(0, solution.minFlips(1, 2, 3));
    }

    @Test
    void bothSetBitsMustFlipWhenTargetBitIsZero() {
        assertEquals(2, solution.minFlips(1, 1, 0));
    }
}
