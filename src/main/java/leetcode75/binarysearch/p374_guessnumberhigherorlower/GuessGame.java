package leetcode75.binarysearch.p374_guessnumberhigherorlower;

public class GuessGame {
    private final int pick;

    protected GuessGame(int pick) {
        this.pick = pick;
    }

    protected int guess(int num) {
        return Integer.compare(pick, num);
    }
}
