package aoc.day03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day03Test {
    @Test
    void part1FirstRucksack() {
        assertThat(new Day03().part1(List.of("vJrwpWtwJgWrhcsFMMfFFhFp"))).isEqualTo("16");
    }
}