package datastructure;

public class Node {
    public Integer value;
    public Node left;
    public Node right;

    public Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static Node of(Integer value, Node left, Node right) {
        return new Node(value, left, right);
    }

    public static Node of(Node left, Node right) {
        return new Node(1, left, right);
    }

    public static Node of(int value) {
        return new Node(value, null, null);
    }

    public static Node of() {
        return new Node(1, null, null);
    }

}
