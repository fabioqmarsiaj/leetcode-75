package leetcode75.queue.p933_numberofrecentcalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecentCounterTest {
    @Test
    void countsRequestsInTrailingThreeThousandMilliseconds() {
        RecentCounter counter = new RecentCounter();
        assertEquals(1, counter.ping(1));
        assertEquals(2, counter.ping(100));
        assertEquals(3, counter.ping(3001));
        assertEquals(3, counter.ping(3002));
    }

    @Test
    void includesBothWindowBoundaries() {
        RecentCounter counter = new RecentCounter();
        assertEquals(1, counter.ping(1));
        assertEquals(2, counter.ping(3001));
        assertEquals(2, counter.ping(3002));
    }
}
