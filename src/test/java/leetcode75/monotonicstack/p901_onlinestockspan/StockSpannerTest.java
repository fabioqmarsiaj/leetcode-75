package leetcode75.monotonicstack.p901_onlinestockspan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockSpannerTest {
    @Test
    void officialExample() {
        StockSpanner stockSpanner = new StockSpanner();
        assertEquals(1, stockSpanner.next(100));
        assertEquals(1, stockSpanner.next(80));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(2, stockSpanner.next(70));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(4, stockSpanner.next(75));
        assertEquals(6, stockSpanner.next(85));
    }

    @Test
    void equalPricesExtendTheSpan() {
        StockSpanner stockSpanner = new StockSpanner();
        assertEquals(1, stockSpanner.next(50));
        assertEquals(2, stockSpanner.next(50));
        assertEquals(3, stockSpanner.next(50));
    }
}
