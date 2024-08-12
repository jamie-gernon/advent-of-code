package aoc.day03;

import aoc.Day;
import aoc.day02.Day02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day03 extends Day {
    static {
        currentDay = new Day03();
    }

    protected Day03() {
        super(3);
    }

    @Override
    public String part1(List<String> input) {

        int totalPriority = 0;
        for (String rucksack: input) {
            int middleString = rucksack.length() / 2;
            String compartment1 = rucksack.substring(0, middleString);
            String compartment2 = rucksack.substring(middleString, rucksack.length());
            Set set1 = new HashSet<>(Arrays.asList(compartment1.split("")));
            Set set2 = new HashSet<>(Arrays.asList(compartment2.split("")));
            set1.retainAll(set2);

        }
        return String.valueOf(totalPriority);
    }

    @Override
    public String part2(List<String> input) {
        return null;
    }
}
