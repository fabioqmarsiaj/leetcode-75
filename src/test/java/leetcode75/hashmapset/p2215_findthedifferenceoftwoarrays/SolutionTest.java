package leetcode75.hashmapset.p2215_findthedifferenceoftwoarrays;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsDistinctValuesUniqueToEachArray() {
        assertDifference(List.of(1, 3), List.of(4, 6),
                solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        assertDifference(List.of(3), List.of(),
                solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
        assertDifference(List.of(), List.of(),
                solution.findDifference(new int[]{1}, new int[]{1}));
    }

    private void assertDifference(List<Integer> expectedFirst, List<Integer> expectedSecond,
                                  List<List<Integer>> actual) {
        assertEquals(2, actual.size());
        assertEquals(new HashSet<>(expectedFirst), new HashSet<>(actual.get(0)));
        assertEquals(new HashSet<>(expectedSecond), new HashSet<>(actual.get(1)));
    }
}
