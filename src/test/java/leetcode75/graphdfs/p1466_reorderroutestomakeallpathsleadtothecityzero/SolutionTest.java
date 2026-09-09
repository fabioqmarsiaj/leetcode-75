package leetcode75.graphdfs.p1466_reorderroutestomakeallpathsleadtothecityzero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void reordersThreeRoads() {
        assertEquals(3, solution.minReorder(6, new int[][] {
            {0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}
        }));
    }

    @Test
    void reordersTwoRoads() {
        assertEquals(2, solution.minReorder(5, new int[][] {
            {1, 0}, {1, 2}, {3, 2}, {3, 4}
        }));
    }

    @Test
    void keepsRoadAlreadyLeadingToZero() {
        assertEquals(0, solution.minReorder(3, new int[][] {{1, 0}, {2, 0}}));
    }
}
