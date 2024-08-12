package aoc.day02;

public interface Outcome {
    static Outcome fromString(String outcome) {
        if (outcome.equals("X")){
            return new Loss();
        } else if (outcome.equals("Y")){
            return new Draw();
        } else {
            return new Win();
        }
    }

    int outcomeScore();

    Move moveFor(Move move);
}
