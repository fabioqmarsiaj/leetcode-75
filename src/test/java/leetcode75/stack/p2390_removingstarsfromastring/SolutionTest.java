package leetcode75.stack.p2390_removingstarsfromastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void removesStarsAndTheirClosestLeftCharacters() {
        assertEquals("lecoe", solution.removeStars("leet**cod*e"));
        assertEquals("", solution.removeStars("erase*****"));
        assertEquals("abc", solution.removeStars("abc"));
    }
}
