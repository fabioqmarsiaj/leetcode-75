package leetcode75.twopointers.p392_issubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void determinesWhetherStringIsSubsequence() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
        assertTrue(solution.isSubsequence("", "ahbgdc"));
    }
}
