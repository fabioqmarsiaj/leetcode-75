package leetcode75.stack.p394_decodestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void decodesRepeatedStrings() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
        assertEquals("aaaaaaaaaa", solution.decodeString("10[a]"));
    }
}
