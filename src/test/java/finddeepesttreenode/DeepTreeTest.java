package finddeepesttreenode;

import datastructure.Node;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeepTreeTest {

    @Test
    void test_getDeepestNode() {
        Node l3 = Node.of(100500);
        Node l2 = Node.of(l3, null);
        Node r2 = Node.of();
        Node l1 = Node.of(l2, r2);
        Node r1 = Node.of();
        Node l0 = Node.of(l1, r1);
        DeepTree tree = new DeepTree(l0);

        Node result = tree.getDeepestNode();

        assertThat(result).isEqualTo(l3);
    }

}
