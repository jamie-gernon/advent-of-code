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
    public String part1(List<String> games) {
        int result = 0;
        for (String game : games) {
            String[] moves = game.split(" ");
            String oppMove = moves[0];
            String yourMove = moves[1];

            if (yourMove.equals("X")) { // Plus 1 if you use Rock
                result += 1;
            } else if (yourMove.equals("Y")) { // Plus 2 if you use Paper
                result += 2;
            } else { // plus 3 if you use Scissors
                result += 3;
            }

            if (yourMove.equals("X") && oppMove.equals("A") ||
                    yourMove.equals("Y") && oppMove.equals("B") ||
                    yourMove.equals("Z") && oppMove.equals("C")) { // draws
                result += 3;
            } else if (yourMove.equals("X") && oppMove.equals("C") ||
                    yourMove.equals("Y") && oppMove.equals("A") ||
                    yourMove.equals("Z") && oppMove.equals("B")) { // wins
                result += 6;
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String part2(List<String> games) {
        String game = games.get(0);
        String theirMove = game.split(" ")[0];
        int result = 0;
        if (theirMove.equals("C")) {
            result += 2;
        } else if (theirMove.equals("A")) {
            result += 3;
        }
        else {
            result += 1;
        }
        String outcome = game.split(" ")[1];
        if (outcome.equals("Y")) {
            result += 3;
        }
        return String.valueOf(result);
    }

}
