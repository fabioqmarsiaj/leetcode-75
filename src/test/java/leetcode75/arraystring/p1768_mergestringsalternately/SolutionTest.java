package leetcode75.arraystring.p1768_mergestringsalternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void mergesAlternately() {
        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
        assertEquals("az", solution.mergeAlternately("a", "z"));
    }
}
