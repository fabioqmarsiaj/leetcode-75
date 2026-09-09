package leetcode75.heappriorityqueue.p215_kthlargestelementinanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void findsSecondLargest() {
        assertEquals(5, solution.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void countsDuplicateValues() {
        assertEquals(4, solution.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void handlesSingleNegativeValue() {
        assertEquals(-7, solution.findKthLargest(new int[] {-7}, 1));
    }
}
