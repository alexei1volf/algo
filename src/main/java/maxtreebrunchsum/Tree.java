package maxtreebrunchsum;

class Tree {

    private Node node;

    public Tree(Node node) {
        this.node = node;
    }

    Integer findMaxBrunchSum() {
        return findMaxBrunchSum(node);
    }

    Integer findMaxBrunchSum(Node tree) {
        Integer value = 0;
        if (tree != null) {
            value = tree.value + Math.max(findMaxBrunchSum(tree.left), findMaxBrunchSum(tree.right));
        }
        return value;

    }
}
