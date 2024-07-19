package aoc.day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Day02Test {

    private Day02 day02 = new Day02();

    @Test
    void scoreForWinLoseDrawWithRockPaperScissors() {
        // RED -> GREEN -> REFACTOR
        // Given
        List<String> input = List.of(
                "A Y", // Rock, Paper (2), we win (6)
                "B X", // Paper, Rock (1), we lose (0)
                "C Z" // Scissors, Scissors (3), we draw (3)
        );

        // When
        String result = day02.part1(input);

        // Then
        assertThat(result).isEqualTo("15");
    }

    @Test
    void loseToPaperWithRock() {
        List<String> input = List.of("B X");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void losetoScissorsWithPaper() {
        List<String> input = List.of("C Y");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void losetoRockWithScissors() {
        List<String> input = List.of("A Z");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("3");
    }

    @Test
    void drawWithRock() {
        List<String> input = List.of("A X");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("4");
    }

    @Test
    void drawWithPaper() {
        List<String> input = List.of("B Y");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("5");
    }

    @Test
    void drawWithScissors() {
        List<String> input = List.of("C Z");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("6");
    }

    @Test
    void winAgainstScissorsWithRock() {
        List<String> input = List.of("C X");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("7");
    }

    @Test
    void winAgainstRockWithPaper() {
        List<String> input = List.of("A Y");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("8");
    }

    @Test
    void winAgainstPaperWithScissors() {
        List<String> input = List.of("B Z");
        String result = day02.part1(input);
        assertThat(result).isEqualTo("9");
    }

    @Test
    void scoreForDrawLoseWinAgainstRockPaperScissors() {
        // Given
        List<String> input = List.of(
                "A Y",
                "B X",
                "C Z"
        );

        // When
        String result = day02.part2(input);

        // Then
        assertThat(result).isEqualTo("12");
    }

    @Test
    void loseWithRockAgainstPaper() {
        List<String> input = List.of(
                "B X"
        );

        // When
        String result = day02.part2(input);

        // Then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void loseWithPaperAgainstScissors() {
        List<String> input = List.of (
                "C X"
        );

        String result = day02.part2(input);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void loseWithScissorsAgainstRock() {
        List<String> input = List.of("A X");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("3");
    }

    @Test
    void drawWithRockPart2() {
        List<String> input = List.of ( "A Y");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("4");
    }

    @Test
    void part2DrawWithPaper() {
        List<String> input = List.of("B Y");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("5");
    }

    @Test
    void part2DrawWithRock() {
        List<String> input = List.of("A Y");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("4");
    }

    @Test
    void part2DrawWithScissors() {
        List<String> input = List.of("C Y");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("6");
    }

    @Test
    void winWithRockAgainstScissors() {
        List<String> input = List.of("C Z");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("8");
    }

    @Test
    void winWithScissorsAgainstPaper() {
        List<String> input = List.of("A Z");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("9");
    }

    @Test
    void winWithPaperAgainstScissors() {
        List<String> input = List.of("B Z");
        String result = day02.part2(input);
        assertThat(result).isEqualTo("7");
    }
}