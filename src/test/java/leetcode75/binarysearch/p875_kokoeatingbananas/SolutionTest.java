package leetcode75.binarysearch.p875_kokoeatingbananas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsMinimumSpeedWithExtraHours() {
        assertEquals(4, solution.minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
    }

    @Test
    void findsMinimumSpeedWithOneHourPerPile() {
        assertEquals(30, solution.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
    }

    @Test
    void lowersSpeedWhenGivenAnotherHour() {
        assertEquals(23, solution.minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6));
    }

    @Test
    void handlesSingleBanana() {
        assertEquals(1, solution.minEatingSpeed(new int[] {1}, 1));
    }
}
