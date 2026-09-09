package leetcode75.dynamicprogramming1d.p790_dominoandtrominotiling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(5, solution.numTilings(3));
        assertEquals(1, solution.numTilings(1));
    }

    @Test
    void tilesTwoColumnsInTwoWays() {
        assertEquals(2, solution.numTilings(2));
    }
}
