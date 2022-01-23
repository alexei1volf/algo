package findnumberwithoutpair;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberWithoutPairFinderTest {

    private List<NumberWithoutPairFinder> numberWithoutPairFinders = List.of(
            new NumberWithoutPairFinderSet(),
            new NumberWithoutPairFinderBitwise()
    );

    private static Stream<Arguments> findNumberWithoutPair() {
        return Stream.of(
                Arguments.of( List.of(1, 2, 3, 4, 7, 5, 1, 2, 3, 4, 5), 7),
                Arguments.of( List.of(3, 2, 3, 1, 2), 1),
                Arguments.of( List.of(5, 3, 5, 2, 3, 1, 1), 2),
                Arguments.of( List.of(1), 1),
                Arguments.of( List.of(2, 2, 1), 1)
        );
    }

    @ParameterizedTest(name = "test_findNumberWithoutPair - {0}")
    @MethodSource("findNumberWithoutPair")
    void test_findNumberWithoutPairOnSet(List<Integer> input, Integer expected) {

        numberWithoutPairFinders.forEach(f -> {
            Integer result = f.findNumberWithoutPair(input);

            assertThat(result).isEqualTo(expected);
        });

    }

}
