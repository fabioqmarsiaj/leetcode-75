package leetcode75.arraystring.p334_increasingtripletsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void detectsIncreasingTriplet() {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertFalse(solution.increasingTriplet(new int[]{1, 1, 1}));
    }
}
