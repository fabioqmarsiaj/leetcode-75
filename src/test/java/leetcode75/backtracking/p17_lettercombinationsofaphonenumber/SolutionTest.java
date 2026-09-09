package leetcode75.backtracking.p17_lettercombinationsofaphonenumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsAllCombinationsForTwoDigits() {
        Set<String> expected = Set.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, new HashSet<>(solution.letterCombinations("23")));
    }

    @Test
    void returnsEmptyListForEmptyDigits() {
        assertEquals(List.of(), solution.letterCombinations(""));
    }

    @Test
    void handlesDigitWithFourLetters() {
        assertEquals(Set.of("p", "q", "r", "s"),
                new HashSet<>(solution.letterCombinations("7")));
    }
}
