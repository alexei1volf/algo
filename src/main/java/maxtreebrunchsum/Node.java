package maxtreebrunchsum;

class Node {
    Integer value;
    Node left;
    Node right;

    public Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static Node of(Integer value, Node left, Node right) {
        return new Node(value, left, right);
    }

    public static Node of(Integer value) {
        return new Node(value, null, null);
    }

}
