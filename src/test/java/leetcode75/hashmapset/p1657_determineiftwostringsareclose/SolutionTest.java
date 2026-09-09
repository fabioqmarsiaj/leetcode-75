package leetcode75.hashmapset.p1657_determineiftwostringsareclose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void determinesWhetherStringsAreClose() {
        assertTrue(solution.closeStrings("abc", "bca"));
        assertFalse(solution.closeStrings("a", "aa"));
        assertTrue(solution.closeStrings("cabbba", "abbccc"));
        assertFalse(solution.closeStrings("aaab", "bbbc"));
    }
}
