package aoc.day02;

public class Scissors implements Move {
    @Override
    public Move winsAgainst() {
        return new Paper();
    }

    @Override
    public Move drawsAgainst() {
        return new Scissors();
    }

    @Override
    public Move losesAgainst() {
        return new Rock();
    }

    @Override
    public int moveScore() {
        return 3;
    }
}
