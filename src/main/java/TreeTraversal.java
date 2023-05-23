import java.util.LinkedList;
import java.util.Queue;

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

    public void horizontalOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        do {
            treatment(node);
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
            if (!queue.isEmpty()) {
                node = queue.poll();
            }
        } while (!queue.isEmpty());
        treatment(node);
    }

    private void treatment(Node node) {
        System.out.print(node.getValue() + " ");
    }
}
