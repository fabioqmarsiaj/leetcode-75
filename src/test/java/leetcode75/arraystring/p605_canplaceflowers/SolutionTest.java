package leetcode75.arraystring.p605_canplaceflowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void determinesWhetherFlowersCanBePlaced() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertTrue(solution.canPlaceFlowers(new int[]{0}, 1));
    }
}
