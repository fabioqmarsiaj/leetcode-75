package leetcode75.linkedlist.p2130_maximumtwinsumofalinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(6, solution.pairSum(list(5, 4, 2, 1)));
        assertEquals(7, solution.pairSum(list(4, 2, 2, 3)));
        assertEquals(100001, solution.pairSum(list(1, 100000)));
    }

    @Test
    void handlesEqualTwinSums() {
        assertEquals(8, solution.pairSum(list(4, 4, 4, 4, 4, 4)));
    }

    private static ListNode list(int... values) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return dummy.next;
    }
}
