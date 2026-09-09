package leetcode75.arraystring.p1431_kidswiththegreatestnumberofcandies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void identifiesKidsWhoCanHaveTheGreatestCount() {
        assertEquals(List.of(true, true, true, false, true),
                solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        assertEquals(List.of(true, false, false, false, false),
                solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        assertEquals(List.of(true, false, true),
                solution.kidsWithCandies(new int[]{12, 1, 12}, 10));
        assertEquals(List.of(true), solution.kidsWithCandies(new int[]{1}, 1));
    }
}
