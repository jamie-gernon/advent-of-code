package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = new Day01();
    }

    public Day01() {
        super(1);
    }

    @Override
    public String part1(List<String> snacks) {
        List<Integer> elvesCalories = totalEachElvesCalories(snacks);
        return String.valueOf(elvesCalories.getFirst());
    }

    private static List<Integer> totalEachElvesCalories(List<String> snacks) {
        int currentElfCalories = 0;
        List<Integer> calories = new ArrayList<>();
        for (String snack : snacks) {
            if (!snack.isEmpty()) {
                currentElfCalories += Integer.parseInt(snack);
            } else {
                calories.add(currentElfCalories);
                currentElfCalories = 0;
            }
        }
        calories.sort(Comparator.reverseOrder());
        return calories;
    }


    @Override
    public String part2(List<String> input) {
        return String.valueOf(caloriesForThreeGreediestElves(input));
    }

    private static int caloriesForThreeGreediestElves(List<String> input) {
        List<Integer> calories = totalEachElvesCalories(input);
        return calories.get(0) + calories.get(1) + calories.get(2);
    }

}
