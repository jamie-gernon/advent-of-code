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
            String theirMove = game.split(" ")[0];
            String outcome = game.split(" ")[1];

            boolean isLoss = outcome.equals("X");
            boolean isDraw = outcome.equals("Y");
            boolean isWin = outcome.equals("Z");

            if (isLoss) {
                if (theirMove.equals("C")) {
                    result += 2;
                } else if (theirMove.equals("A")) {
                    result += 3;
                } else if (theirMove.equals("B")) {
                    result += 1;
                }
            }
            else if (isDraw) {
                if (theirMove.equals("C")) {
                    result += 6;
                } else if (theirMove.equals("A")) {
                    result += 4;
                } else if (theirMove.equals("B")) {
                    result += 5;
                }
            }
            else if (isWin) {
                if (theirMove.equals("C")) {
                    result += 7;
                } else if (theirMove.equals("A")) {
                    result += 9;
                } else if (theirMove.equals("B")) {
                    result += 8;
                }
            }
        }

        return String.valueOf(result);
    }

}
