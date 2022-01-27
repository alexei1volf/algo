package squareroot;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    private final Square square = new Square();

    private static Stream<Arguments> getSquare() {
        return Stream.of(
                Arguments.of( 4, 2),
                Arguments.of( 25, 5),
                Arguments.of( 225, 15),
                Arguments.of( 100, 10),
                Arguments.of( 1, 1),
                Arguments.of( 0, 0)
        );
    }

    @ParameterizedTest(name = "getSquare - {0}")
    @MethodSource("getSquare")
    void test_getSquare(Integer input, Integer expected) {
        int result = this.square.getSquare(input);
        assertThat(result).isEqualTo(expected);
    }
}
