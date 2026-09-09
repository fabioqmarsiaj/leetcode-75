package leetcode75.arraystring.p345_reversevowelsofastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reversesOnlyVowels() {
        assertEquals("AceCreIm", solution.reverseVowels("IceCreAm"));
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
        assertEquals("rhythm", solution.reverseVowels("rhythm"));
    }
}
