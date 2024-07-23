package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    public static final int DRAW_SCORE = 3;
    public static final int WIN_SCORE = 6;
    public static final int LOSS_SCORE = 0;
    public static final int SCISSORS_SCORE = 3;
    public static final int ROCK_SCORE = 1;
    public static final int PAPER_SCORE = 2;

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

            String ourMove;
            if (isLoss(outcome)) {
                result += LOSS_SCORE;
                if (isScissors(theirMove)) {
                    ourMove = "Paper";
                }
                else if (isRock(theirMove)) {
                    ourMove = "Scissors";
                }
                else {
                    ourMove = "Rock";
                }
            }
            else if (isDraw(outcome)) {
                result += DRAW_SCORE;
                if (isPaper(theirMove)) {
                    ourMove = "Paper";
                }
                else if (isScissors(theirMove)) {
                    ourMove = "Scissors";
                }
                else {
                    ourMove = "Rock";
                }
            }
            else {
                result += WIN_SCORE;
                if (isRock(theirMove)) {
                    ourMove = "Paper";
                }
                else if (isPaper(theirMove)) {
                    ourMove = "Scissors";
                }
                else {
                    ourMove = "Rock";
                }
            }
            if (ourMove.equals("Paper")) {
                result += PAPER_SCORE;
            } else if (ourMove.equals("Scissors")) {
                result += SCISSORS_SCORE;
            } else {
                result += ROCK_SCORE;
            }
        }

        return String.valueOf(result);
    }

    private static boolean isScissors(String theirMove) {
        return theirMove.equals("C");
    }

    private static boolean isPaper(String theirMove) {
        return theirMove.equals("B");
    }

    private static boolean isRock(String theirMove) {
        return theirMove.equals("A");
    }

    private static boolean isWin(String outcome) {
        return outcome.equals("Z");
    }

    private static boolean isDraw(String outcome) {
        return outcome.equals("Y");
    }

    private static boolean isLoss(String outcome) {
        return outcome.equals("X");
    }

}
