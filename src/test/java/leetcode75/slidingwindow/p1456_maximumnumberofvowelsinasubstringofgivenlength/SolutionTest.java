package leetcode75.slidingwindow.p1456_maximumnumberofvowelsinasubstringofgivenlength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsMaximumVowelsInFixedLengthSubstring() {
        assertEquals(3, solution.maxVowels("abciiidef", 3));
        assertEquals(2, solution.maxVowels("aeiou", 2));
        assertEquals(2, solution.maxVowels("leetcode", 3));
        assertEquals(0, solution.maxVowels("rhythms", 4));
    }
}
