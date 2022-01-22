package findnumberwithoutpair;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumberWithoutPairTest {

    private final NumberWithoutPair numberWithoutPair = new NumberWithoutPair();

    private static Stream<Arguments> test_findNumberWithoutPair() {
        return Stream.of(
                Arguments.of( List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 7), 7)
        );
    }

    @ParameterizedTest(name = "test_findNumberWithoutPair - {0}")
    @MethodSource
    void test_findNumberWithoutPair(List<Integer> input, Integer expected) {

        Integer result = this.numberWithoutPair.findNumberWithoutPair(input);

        assertThat(result).isEqualTo(expected);
    }
}
