package leetcode75.graphdfs.p841_keysandrooms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void visitsAllRoomsInChain() {
        assertTrue(solution.canVisitAllRooms(List.of(
                List.of(1), List.of(2), List.of(3), List.of())));
    }

    @Test
    void cannotReachEveryRoom() {
        assertFalse(solution.canVisitAllRooms(List.of(
                List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
    }

    @Test
    void singleRoomNeedsNoKeys() {
        assertTrue(solution.canVisitAllRooms(List.of(List.of())));
    }
}
