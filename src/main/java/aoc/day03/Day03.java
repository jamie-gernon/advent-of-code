package aoc.day03;

import aoc.Day;
import aoc.day02.Day02;

import java.util.*;

public class Day03 extends Day {
    static {
        currentDay = new Day03();
    }

    protected Day03() {
        super(3);
    }

    @Override
    public String part1(List<String> input) {

        // Things about collections:
        // List: values can go in more than once, items are ordered
        // Set: can’t exist in a set more than once, does not have an order
        // Map: two values can’t have the same key, the last one overwrites the first, items are not ordered

        int totalPriorityPart1 = 0;
        for (String rucksack: input) {
            int middleString = rucksack.length() / 2;
            String compartment1 = rucksack.substring(0, middleString);
            String compartment2 = rucksack.substring(middleString, rucksack.length());
            Set <String> set1 = new HashSet<>(Arrays.asList(compartment1.split("")));
            Set <String> set2 = new HashSet<>(Arrays.asList(compartment2.split("")));
            set1.retainAll(set2);
            if (set1.size() > 1) {
                throw new IllegalStateException("There can only be one");
            }
            for (String item : set1) {
                Character item2 = item.toCharArray()[0];
                if (Character.isLowerCase(item2)) {
                    totalPriorityPart1 += item2 -'a'+ 1;
                } else {
                    totalPriorityPart1 += item2 -'A'+ 27;
                }
            }
        }
        return String.valueOf(totalPriorityPart1);
    }

    @Override
    public String part2(List<String> input) {

        int totalPriorityPart2 = 0;
        for (int index = 0; index < input.size(); index += 3) {
            String backpack1 = input.get(index);
            String backpack2 = input.get(index + 1);
            String backpack3 = input.get(index + 2);
            Set <String> set1 = new HashSet<>(Arrays.asList(backpack1.split("")));
            Set <String> set2 = new HashSet<>(Arrays.asList(backpack2.split("")));
            Set <String> set3 = new HashSet<>(Arrays.asList(backpack3.split("")));
            set1.retainAll(set2);
            set1.retainAll(set3);
            if (set1.size() > 1) {
                throw new IllegalStateException("There can only be one");
            }
            for (String item : set1) {
                Character item2 = item.toCharArray()[0];
                if (Character.isLowerCase(item2)) {
                    totalPriorityPart2 += item2 -'a'+ 1;
                } else {
                    totalPriorityPart2 += item2 -'A'+ 27;
                }
            }
        }
        return String.valueOf(totalPriorityPart2);
    }
}
