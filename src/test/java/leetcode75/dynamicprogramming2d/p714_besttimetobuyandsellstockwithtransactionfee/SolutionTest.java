package leetcode75.dynamicprogramming2d.p714_besttimetobuyandsellstockwithtransactionfee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        assertEquals(6, solution.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

    @Test
    void cannotTradeWithOnePrice() {
        assertEquals(0, solution.maxProfit(new int[]{5}, 2));
    }
}
