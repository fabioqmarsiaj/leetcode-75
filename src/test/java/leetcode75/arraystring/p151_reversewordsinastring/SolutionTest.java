package leetcode75.arraystring.p151_reversewordsinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reversesWordsAndNormalizesSpaces() {
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        assertEquals("world hello", solution.reverseWords("  hello world  "));
        assertEquals("example good a", solution.reverseWords("a good   example"));
        assertEquals("word", solution.reverseWords("word"));
    }
}
