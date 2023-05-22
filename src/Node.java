public class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
    }

    void recPreOrder() {
        treatment();
        if (left != null) left.recPreOrder();
        if (right != null) right.recPreOrder();
    }

    void recInOrder() {
        if (left != null) left.recInOrder();
        treatment();
        if (right != null) right.recInOrder();
    }

    void recPostOrder() {
        if (left != null) left.recPostOrder();
        if (right != null) right.recPostOrder();
        treatment();
    }

    private void treatment() {
        System.out.println(this.value);
    }
}
