package leetcode75.binarysearch.p374_guessnumberhigherorlower;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void guessesMiddlePick() {
        assertEquals(6, new Solution(6).guessNumber(10));
    }

    @Test
    void guessesOnlyPossibleNumber() {
        assertEquals(1, new Solution(1).guessNumber(1));
    }

    @Test
    void guessesUpperBoundaryWithoutOverflow() {
        assertEquals(Integer.MAX_VALUE,
                new Solution(Integer.MAX_VALUE).guessNumber(Integer.MAX_VALUE));
    }
}
