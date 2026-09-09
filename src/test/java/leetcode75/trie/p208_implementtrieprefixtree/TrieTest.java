package leetcode75.trie.p208_implementtrieprefixtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrieTest {
    @Test
    void officialExample() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }

    @Test
    void distinguishesWordsWithSharedPrefix() {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("cart");
        assertTrue(trie.search("car"));
        assertTrue(trie.search("cart"));
        assertFalse(trie.search("care"));
    }
}
