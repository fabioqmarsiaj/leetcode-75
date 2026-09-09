package leetcode75.linkedlist.p2095_deletethemiddlenodeofalinkedlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertArrayEquals(new int[] {1, 3, 4, 1, 2, 6}, values(solution.deleteMiddle(list(1, 3, 4, 7, 1, 2, 6))));
        assertArrayEquals(new int[] {1, 2, 4}, values(solution.deleteMiddle(list(1, 2, 3, 4))));
        assertArrayEquals(new int[] {2}, values(solution.deleteMiddle(list(2, 1))));
    }

    @Test
    void deletesTheOnlyNode() {
        assertArrayEquals(new int[0], values(solution.deleteMiddle(list(1))));
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
