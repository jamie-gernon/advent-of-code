package aoc.day02;

public class Paper implements Move {
    @Override
    public Move winsAgainst() {
        return new Rock();
    }

    @Override
    public Move drawsAgainst() {
        return new Paper();
    }

    @Override
    public Move losesAgainst() {
        return new Scissors();
    }

    @Override
    public int moveScore() {
        return 2;
    }
}
