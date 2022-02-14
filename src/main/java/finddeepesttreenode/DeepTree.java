package finddeepesttreenode;

import datastructure.Node;
import datastructure.NodeWithDepth;

public class DeepTree {

    private Node root;

    public DeepTree(Node root) {
        this.root = root;
    }

    public Node getDeepestNode(){
        if (root == null) {
            throw new IllegalStateException("Node should not be null!");
        }

        NodeWithDepth nodeWithDepth = getMaxNode(root, 0);
        return	nodeWithDepth.node;

    }

    NodeWithDepth getMaxNode(Node node, int nodeDepth) {

        NodeWithDepth left = null;
        NodeWithDepth right = null;

        int nextNodeDepth = nodeDepth + 1;
        if (node.left != null) {

            left = getMaxNode(node.left, nextNodeDepth);

        }
        if (node.right != null) {
            right = getMaxNode(node.right, nextNodeDepth);
        }

        if (left == null && right == null) {
            return new NodeWithDepth(node, nodeDepth);
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        if (left.nodeDepth > right.nodeDepth) {
            return left;
        } else {
            return right;
        }

    }
}
