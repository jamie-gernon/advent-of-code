package aoc.day02;

public interface Move {

    static Move fromString(String move) {
        if (move.equals("A")) {
            return new Rock();
        }
        else if (move.equals("B")) {
            return new Paper();
        }
        else {
            return new Scissors();
        }
    }

    Move winsAgainst();

    Move drawsAgainst();

    Move losesAgainst();

    int moveScore();

}
