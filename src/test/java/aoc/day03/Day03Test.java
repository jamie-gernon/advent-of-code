package aoc.day03;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day03Test {
    @Test
    void part1FirstRucksack() {
        // vJrwpWtwJgWr hcsFMMfFFhFp
        assertThat(new Day03().part1(List.of("vJrwpWtwJgWrhcsFMMfFFhFp"))).isEqualTo("16");
    }

    @Test
    void part1SecondRucksack() {
        assertThat(new Day03().part1(List.of("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"))).isEqualTo("38");
    }

    @Test
    void howSetsWork() {
        Set<String> testSet = new HashSet<>();
        testSet.add("p");
        testSet.add("p");
        assertThat(testSet.size()).isEqualTo(1);
    }

    @Test
    void part2FirstGroup() {
        assertThat(new Day03().part2(List.of(
                "vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg"
        ))).isEqualTo("18");
    }

    @Test
    void part2SecondGroup() {
        assertThat(new Day03().part2(List.of(
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw"))).isEqualTo("52");
        // The common letter is Z
    }

    @Test
    void part2MultipleGroups() {
        assertThat(new Day03().part2(List.of(
                "vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg",
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw"))).isEqualTo("70");
        // The common letter is Z
    }

    @Test
    @Disabled
    void howIntsWork() {
        int counter;
        for (counter = 0; counter >= 0; counter++) {

        }
        assertThat(counter).isLessThan(0);
        assertThat(counter).isEqualTo(0);
    }
}