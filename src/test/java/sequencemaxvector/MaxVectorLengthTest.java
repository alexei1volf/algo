package sequencemaxvector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxVectorLengthTest {

    private List<MaxVectorLength> maxVectorLengthFinders;

    @BeforeEach
    void setUp() {
        maxVectorLengthFinders = List.of(new MaxVectorLengthImpl());
    }

    private static Stream<Arguments> findMaxVectorLength() {
        return Stream.of(
                Arguments.of( List.of(1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1), 3),
                Arguments.of( List.of(0, 1, 1, 1, 1, 1), 5),
                Arguments.of( List.of(0, 0, 0), 0),
                Arguments.of( List.of(1, 0), 1),
                Arguments.of( List.of(1), 1),
                Arguments.of( List.of(0), 0),
                Arguments.of( List.of(), 0)
        );
    }

    @ParameterizedTest(name = "findMaxVectorLength - {0}")
    @MethodSource("findMaxVectorLength")
    void test_findMaxVectorLength(List<Integer> input, Integer expected) {

        maxVectorLengthFinders.forEach(f -> {
            Integer result = f.findMaxLength(input);

            assertThat(result).isEqualTo(expected);
        });

    }

}
