package leetcode75.linkedlist.p328_oddevenlinkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[] {1, 3, 5, 2, 4}, values(solution.oddEvenList(list(1, 2, 3, 4, 5))));
        assertArrayEquals(new int[] {2, 3, 6, 7, 1, 5, 4}, values(solution.oddEvenList(list(2, 1, 3, 5, 6, 4, 7))));
    }

    @Test
    void handlesEmptyAndSingleNodeLists() {
        assertArrayEquals(new int[0], values(solution.oddEvenList(null)));
        assertArrayEquals(new int[] {9}, values(solution.oddEvenList(list(9))));
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
