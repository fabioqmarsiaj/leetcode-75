package leetcode75.prefixsum.p1732_findthehighestaltitude;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsHighestAltitudeIncludingStart() {
        assertEquals(1, solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        assertEquals(0, solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
        assertEquals(6, solution.largestAltitude(new int[]{1, 2, 3}));
    }
}
