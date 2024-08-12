package aoc.day02;

public class Win implements Outcome {
    @Override
    public int outcomeScore() {
        return 6;
    }

    @Override
    public Move moveFor(Move move) {
        return move.losesAgainst();
    }
}
