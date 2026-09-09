package leetcode75.dynamicprogramming2d.p1143_longestcommonsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void matchesSingleCharacters() {
        assertEquals(1, solution.longestCommonSubsequence("a", "a"));
    }
}
