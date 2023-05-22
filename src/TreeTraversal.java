public class TreeTraversal {
    public void recPreOrder(Node node) {
        treatment(node);
        if (node.getLeft() != null) {
            recPreOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            recPreOrder(node.getRight());
        }
    }

    public void recInOrder(Node node) {
        if (node.getLeft() != null) {
            recInOrder(node.getLeft());
        }
        treatment(node);
        if (node.getRight() != null) {
            recInOrder(node.getRight());
        }
    }

    public void recPostOrder(Node node) {
        if (node.getLeft() != null) {
            recPostOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            recPostOrder(node.getRight());
        }
        treatment(node);
    }

    private void treatment(Node node) {
        System.out.println(node.getValue());
    }
}
