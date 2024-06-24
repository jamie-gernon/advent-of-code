package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = new Day01();
    }

    public Day01() {
        super(1);
    }

    @Override
    public String part1(List<String> input) {
        List<Integer> calories = countCalories1(input);
        return String.valueOf(calories.getLast());
    }

    private static List<Integer> countCalories1(List<String> input) {
        int numOfCalories = 0;
        List<Integer> calories = new ArrayList<>();
        for (String snack : input) {
            if (!snack.equals("")) {
                numOfCalories += Integer.valueOf(snack);
            } else {
                calories.add(numOfCalories);
                numOfCalories = 0;
            }
        }
        Collections.sort(calories);
        return calories;
    }


    @Override
    public String part2(List<String> input) {
        int calories = countCalories2(input);
        return String.valueOf(calories);
    }

    private static int countCalories2(List<String> input) {
        int totalCalories = 0;
        int numOfCalories = 0;
        List<Integer> calories = new ArrayList<>();
        for (String snack : input) {
            if (!snack.equals("")) {
                numOfCalories += Integer.valueOf(snack);
            } else {
                calories.add(numOfCalories);
                numOfCalories = 0;
            }
        }

        Collections.sort(calories);
        for (int index = calories.size()-1; index > calories.size()-4; index --){
            totalCalories += Integer.valueOf(calories.get(index));
        }
        return totalCalories;
    }

}
