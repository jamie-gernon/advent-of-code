package aoc.day02;

public class Rock implements Move {
    @Override
    public Move winsAgainst() {
        return new  Scissors();
    }

    @Override
    public Move drawsAgainst() {
        return new Rock();
    }

    @Override
    public Move losesAgainst() {
        return new Paper();
    }

    @Override
    public int moveScore() {
        return 1;
    }
}
