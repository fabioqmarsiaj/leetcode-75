package leetcode75.arraystring.p238_productofarrayexceptself;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void returnsProductsExcludingEachPosition() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
        assertArrayEquals(new int[]{0, 0}, solution.productExceptSelf(new int[]{0, 0}));
    }
}
