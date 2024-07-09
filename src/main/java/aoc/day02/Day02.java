package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    static {
        currentDay = new Day02();
    }

    public Day02() {
        super(2);
    }

    @Override
    public String part1(List<String> input) {
        int result = 0;
        String game = input.get(0);
        String[] moves = game.split(" ");
        String yourMove = moves[1];

        if (yourMove.equals("X")){
            result += 1;
        } else if (yourMove.equals("Y")) {
            result += 2;
        } else {
            result += 3;
        }

        return String.valueOf(result);
    }

    @Override
    public String part2(List<String> input) {
        return null;
    }

}
