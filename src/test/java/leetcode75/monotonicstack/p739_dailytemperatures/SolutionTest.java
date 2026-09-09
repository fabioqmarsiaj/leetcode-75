package leetcode75.monotonicstack.p739_dailytemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
        assertArrayEquals(new int[]{1, 1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 40, 50, 60}));
        assertArrayEquals(new int[]{1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 60, 90}));
    }

    @Test
    void equalTemperaturesAreNotWarmer() {
        assertArrayEquals(new int[]{0, 0}, solution.dailyTemperatures(new int[]{50, 50}));
    }
}
