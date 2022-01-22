package squareroot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private final Square square = new Square();

    @Test
    void test_getSquare() {
        int result = this.square.getSquare(1);

        assertThat(result).isEqualTo(0);
    }
}
