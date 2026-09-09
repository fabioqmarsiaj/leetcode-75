package leetcode75.queue.p649_dota2senate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void predictsWinningParty() {
        assertEquals("Radiant", solution.predictPartyVictory("RD"));
        assertEquals("Dire", solution.predictPartyVictory("RDD"));
        assertEquals("Radiant", solution.predictPartyVictory("R"));
    }
}
