package leetcode75.arraystring.p1071_greatestcommondivisorofstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsGreatestCommonDivisorString() {
        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
        assertEquals("A", solution.gcdOfStrings("A", "A"));
    }
}
