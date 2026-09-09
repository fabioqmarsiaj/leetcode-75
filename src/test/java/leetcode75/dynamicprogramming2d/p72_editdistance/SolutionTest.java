package leetcode75.dynamicprogramming2d.p72_editdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(3, solution.minDistance("horse", "ros"));
        assertEquals(5, solution.minDistance("intention", "execution"));
    }

    @Test
    void insertsEveryCharacterIntoEmptyWord() {
        assertEquals(3, solution.minDistance("", "abc"));
    }
}
