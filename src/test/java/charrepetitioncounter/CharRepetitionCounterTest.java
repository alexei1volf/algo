package charrepetitioncounter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CharRepetitionCounterTest {

    private final CharRepetitionCounter charRepetitionCounter = new CharRepetitionCounter();

    private static Stream<Arguments> getNumberOfRepetitions() {
        return Stream.of(
                Arguments.of("ABB", "AB2"),
                Arguments.of("ABBCCC", "AB2C3"),
                Arguments.of( "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB", "A4B3C2XYZD4E3F3A6B28")
        );
    }

    @ParameterizedTest(name = "getNumberOfRepetitions - {0}")
    @MethodSource("getNumberOfRepetitions")
    void test_getNumberOfRepetitions(String input, String expected) {
        String result = charRepetitionCounter.getNumberOfRepetitions(input);
        assertThat(result).isEqualTo(expected);
    }
}
