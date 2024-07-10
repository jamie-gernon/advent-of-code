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

        for (int i = 0; i < moves.length; i += 2) {
            String oppMove = moves[i];
            String yourMove = moves[i + 1];

            if (yourMove.equals("X")) { // Plus 1 if you use Rock
                result += 1;
            } else if (yourMove.equals("Y")) { // Plus 2 if you use Paper
                result += 2;
            } else { // plus 3 if you use Scissors
                result += 3;
            }

            if (yourMove.equals("X") && oppMove.equals("A") ||
                yourMove.equals("Y") && oppMove.equals("B") ||
                yourMove.equals("Z") && oppMove.equals("C")){ // draws
                result += 3;
            } else if (yourMove.equals("X") && oppMove.equals("C") ||
                       yourMove.equals("Y") && oppMove.equals("A") ||
                       yourMove.equals("Z") && oppMove.equals("B")) { // Rock beats Scissors
                result += 6;
            }
        }

        return String.valueOf(result);
    }

    @Override
    public String part2(List<String> input) {
        return null;
    }

}
