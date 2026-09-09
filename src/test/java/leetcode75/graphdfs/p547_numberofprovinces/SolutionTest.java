package leetcode75.graphdfs.p547_numberofprovinces;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsTwoProvinces() {
        assertEquals(2, solution.findCircleNum(new int[][] {
            {1, 1, 0}, {1, 1, 0}, {0, 0, 1}
        }));
    }

    @Test
    void findsThreeDisconnectedProvinces() {
        assertEquals(3, solution.findCircleNum(new int[][] {
            {1, 0, 0}, {0, 1, 0}, {0, 0, 1}
        }));
    }

    @Test
    void handlesSingleCity() {
        assertEquals(1, solution.findCircleNum(new int[][] {{1}}));
    }
}
