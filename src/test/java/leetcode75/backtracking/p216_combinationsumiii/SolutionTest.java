package leetcode75.backtracking.p216_combinationsumiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsSingleCombination() {
        assertEquals(Set.of(List.of(1, 2, 4)), normalize(solution.combinationSum3(3, 7)));
    }

    @Test
    void findsAllCombinations() {
        assertEquals(Set.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)),
                normalize(solution.combinationSum3(3, 9)));
    }

    @Test
    void returnsEmptyWhenNoCombinationExists() {
        assertEquals(Set.of(), normalize(solution.combinationSum3(4, 1)));
    }

    @Test
    void handlesMaximumValidSingleNumber() {
        assertEquals(Set.of(List.of(9)), normalize(solution.combinationSum3(1, 9)));
    }

    private Set<List<Integer>> normalize(List<List<Integer>> combinations) {
        return new HashSet<>(combinations);
    }
}
