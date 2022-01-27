package maxtreebrunchsum;

import org.junit.jupiter.api.Test;

import static maxtreebrunchsum.Node.of;
import static org.assertj.core.api.Assertions.assertThat;

class TreeTest {

    @Test
    void test_findMaxBrunchSum() {
        Tree three = new Tree(of(1, of(2, of(1, of(9), null), of(7)), of(9, of(5, of(7), null), of(2))));
        Integer result = three.findMaxBrunchSum();
        assertThat(result).isEqualTo(22);
    }
}
