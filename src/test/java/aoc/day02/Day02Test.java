package aoc.day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Day02Test {

    @Test
    @Disabled
    void scoreForWinLoseDrawWithRockPaperScissors() {
        // RED -> GREEN -> REFACTOR
        // Given
        List<String> input = List.of(
                "A Y", // Rock, Paper (2), we win (6)
                "B X", // Paper, Rock (1), we lose (0)
                "C Z" // Scissors, Scissors (3), we draw (3)
        );

        // When
        String result = new Day02().part1(input);

        // Then
        assertThat(result).isEqualTo("15");
    }

    @Test
    void loseWithRock() {
        List<String> input = List.of("B X"); // Paper, Rock
        String result = new Day02().part1(input);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void loseWithPaper() {
        List<String> input = List.of("C Y"); // Scissors, Paper
        String result = new Day02().part1(input);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void loseWithScissors() {
        List<String> input = List.of("A Z"); // Rock, Scissors
        String result = new Day02().part1(input);
        assertThat(result).isEqualTo("3");
    }

    @Test
    @Disabled
    void part2() {
        // Given
        List<String> input = List.of(
                ""
        );

        // When
        String result = new Day02().part2(input);

        // Then
        assertThat(result).isEqualTo("");
    }
}