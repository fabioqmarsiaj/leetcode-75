package leetcode75.hashmapset.p1207_uniquenumberofoccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void determinesWhetherOccurrenceCountsAreUnique() {
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
        assertTrue(solution.uniqueOccurrences(new int[]{7}));
    }
}
