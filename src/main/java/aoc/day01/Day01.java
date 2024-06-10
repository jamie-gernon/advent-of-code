package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        int numOfCalories = 0;
        int highestCalories = 0;
        for (String snack : input) {
            if (!snack.equals("")) {
                numOfCalories += Integer.valueOf(snack);
            } else {
                if (numOfCalories > highestCalories) {
                    highestCalories = numOfCalories;
                }
                numOfCalories = 0;
            }
        }
        return String.valueOf(highestCalories);
    }


    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
