package aoc.day02;

public class Draw implements Outcome {
    @Override
    public int outcomeScore() {
        return 3;
    }

    @Override
    public Move moveFor(Move move) {
        return move.drawsAgainst();
    }


}
