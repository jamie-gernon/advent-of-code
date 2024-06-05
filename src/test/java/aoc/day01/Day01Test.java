package aoc.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Day01Test {

    @Test
    public void testPart1() {
        // Given
        List<String> input = List.of("1000",
                "2000",
                "3000",
                "",
                "4000",
                "",
                "5000",
                "6000",
                "",
                "7000",
                "8000",
                "9000",
                "",
                "10000"
        );

        // When
        String result = new Day01().part1(input);

        // Then
        assertThat(result).isEqualTo("24000");
    }

    @Test
    public void testPart2() {
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part2(input);

        // Then
        assertThat(result).isEqualTo(input.get(0));
    }
}
