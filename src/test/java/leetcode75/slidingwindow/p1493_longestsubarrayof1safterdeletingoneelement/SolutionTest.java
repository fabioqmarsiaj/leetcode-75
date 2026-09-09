package leetcode75.slidingwindow.p1493_longestsubarrayof1safterdeletingoneelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsLongestOnesAfterOneDeletion() {
        assertEquals(3, solution.longestSubarray(new int[]{1, 1, 0, 1}));
        assertEquals(5, solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        assertEquals(2, solution.longestSubarray(new int[]{1, 1, 1}));
        assertEquals(0, solution.longestSubarray(new int[]{0}));
    }
}
