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
        int result = 0;
        for (String game :games) {
            String round = games.get(0);
            String theirMove = round.split(" ")[0];
            String outcome = round.split(" ")[1];

            if (theirMove.equals("C") && outcome.equals("X")) {
                result += 2;
            } else if (theirMove.equals("A") && outcome.equals("X")) {
                result += 3;
            } else if (theirMove.equals("B") && outcome.equals("X")) {
                result += 1;
            }

            if (theirMove.equals("C") && outcome.equals("Y")) {
                result += 6;
            } else if (theirMove.equals("A") && outcome.equals("Y")) {
                result += 4;
            } else if (theirMove.equals("B") && outcome.equals("Y")) {
                result += 5;
            }

            if (theirMove.equals("C") && outcome.equals("Z")) {
                result += 8;
            } else if (theirMove.equals("A") && outcome.equals("Z")) {
                result += 9;
            } else if (theirMove.equals("B") && outcome.equals("Z")) {
                result += 7;
            }
        }

        return String.valueOf(result);
    }

}
