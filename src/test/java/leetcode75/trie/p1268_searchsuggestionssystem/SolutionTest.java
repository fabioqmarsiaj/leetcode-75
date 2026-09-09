package leetcode75.trie.p1268_searchsuggestionssystem;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void officialExamples() {
        assertEquals(List.of(
                List.of("mobile", "moneypot", "monitor"),
                List.of("mobile", "moneypot", "monitor"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad")),
                solution.suggestedProducts(
                        new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                        "mouse"));
        assertEquals(List.of(List.of("havana"), List.of("havana"), List.of("havana"),
                        List.of("havana"), List.of("havana"), List.of("havana")),
                solution.suggestedProducts(new String[]{"havana"}, "havana"));
        assertEquals(List.of(
                List.of("baggage", "bags", "banner"),
                List.of("baggage", "bags", "banner"),
                List.of("baggage", "bags"),
                List.of("bags")),
                solution.suggestedProducts(
                        new String[]{"bags", "baggage", "banner", "box", "cloths"},
                        "bags"));
    }

    @Test
    void returnsEmptySuggestionsAfterPrefixStopsMatching() {
        assertEquals(List.of(List.of("a"), List.of()),
                solution.suggestedProducts(new String[]{"a"}, "ab"));
    }
}
