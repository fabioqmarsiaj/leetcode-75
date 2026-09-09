package leetcode75.heappriorityqueue.p2336_smallestnumberininfiniteset;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmallestInfiniteSetTest {
    @Test
    void followsOfficialOperationSequence() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();

        set.addBack(2);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
        assertEquals(3, set.popSmallest());
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(4, set.popSmallest());
        assertEquals(5, set.popSmallest());
    }

    @Test
    void addingPresentNumberDoesNotDuplicateIt() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();

        set.addBack(1);
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
    }
}
