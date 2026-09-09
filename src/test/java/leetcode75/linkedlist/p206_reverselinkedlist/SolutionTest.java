package leetcode75.linkedlist.p206_reverselinkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, values(solution.reverseList(list(1, 2, 3, 4, 5))));
        assertArrayEquals(new int[] {2, 1}, values(solution.reverseList(list(1, 2))));
        assertNull(solution.reverseList(null));
    }

    @Test
    void leavesSingleNodeUnchanged() {
        assertArrayEquals(new int[] {7}, values(solution.reverseList(list(7))));
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

    private static int[] values(ListNode head) {
        java.util.List<Integer> values = new java.util.ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
