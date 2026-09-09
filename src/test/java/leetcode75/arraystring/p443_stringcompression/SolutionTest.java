package leetcode75.arraystring.p443_stringcompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void compressesInPlace() {
        assertCompression(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6,
                new char[]{'a', '2', 'b', '2', 'c', '3'});
        assertCompression(new char[]{'a'}, 1, new char[]{'a'});
        assertCompression(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},
                4, new char[]{'a', 'b', '1', '2'});
        assertCompression(new char[]{'x', 'x'}, 2, new char[]{'x', '2'});
    }

    private void assertCompression(char[] input, int expectedLength, char[] expectedPrefix) {
        int actualLength = solution.compress(input);
        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedPrefix, java.util.Arrays.copyOf(input, actualLength));
    }
}
