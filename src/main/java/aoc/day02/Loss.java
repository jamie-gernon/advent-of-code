package aoc.day02;

public class Loss implements Outcome {
    @Override
    public int outcomeScore() {
        return 0;
    }

    @Override
    public Move moveFor(Move move) {
        return move.winsAgainst();
    }
}
