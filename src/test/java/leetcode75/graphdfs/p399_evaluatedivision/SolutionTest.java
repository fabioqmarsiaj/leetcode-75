package leetcode75.graphdfs.p399_evaluatedivision;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private static final double DELTA = 1e-5;
    private final Solution solution = new Solution();

    @Test
    void evaluatesConnectedAndUnknownQueries() {
        assertArrayEquals(
                new double[] {6.0, 0.5, -1.0, 1.0, -1.0},
                solution.calcEquation(
                        List.of(List.of("a", "b"), List.of("b", "c")),
                        new double[] {2.0, 3.0},
                        List.of(List.of("a", "c"), List.of("b", "a"),
                                List.of("a", "e"), List.of("a", "a"),
                                List.of("x", "x"))),
                DELTA);
    }

    @Test
    void evaluatesDirectAndReverseQueries() {
        assertArrayEquals(
                new double[] {3.75, 0.4, 5.0, 0.2},
                solution.calcEquation(
                        List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd")),
                        new double[] {1.5, 2.5, 5.0},
                        List.of(List.of("a", "c"), List.of("c", "b"),
                                List.of("bc", "cd"), List.of("cd", "bc"))),
                DELTA);
    }

    @Test
    void keepsDisconnectedComponentsSeparate() {
        assertArrayEquals(
                new double[] {0.5, 4.0, -1.0, 1.0},
                solution.calcEquation(
                        List.of(List.of("a", "b"), List.of("c", "d")),
                        new double[] {2.0, 4.0},
                        List.of(List.of("b", "a"), List.of("c", "d"),
                                List.of("a", "d"), List.of("d", "d"))),
                DELTA);
    }
}
