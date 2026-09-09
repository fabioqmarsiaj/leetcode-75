package leetcode75.twopointers.p1679_maxnumberofksumpairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsMaximumNumberOfPairs() {
        assertEquals(2, solution.maxOperations(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        assertEquals(0, solution.maxOperations(new int[]{1, 1}, 3));
    }
}
