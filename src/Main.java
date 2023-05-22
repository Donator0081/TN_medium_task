public class Main {
    public static void main(String[] args) {
        printTestResults();
    }

    private static void printTestResults() {
        TreeTraversal traversal = new TreeTraversal();
        Node node1 = new Node(80);
        Node node2 = new Node(30);
        Node node3 = new Node(120);
        node1.setLeft(node2);
        node1.setRight(node3);
        Node node4 = new Node(25);
        Node node5 = new Node(35);
        node2.setLeft(node4);
        node2.setRight(node5);
        Node node6 = new Node(115);
        Node node7 = new Node(125);
        node3.setLeft(node6);
        node3.setRight(node7);
        System.out.println("preOrder()");
        traversal.recPreOrder(node1);
        System.out.println("----------");
        System.out.println("inOrder()");
        traversal.recInOrder(node1);
        System.out.println("----------");
        System.out.println("postOrder()");
        traversal.recPostOrder(node1);
        System.out.println("----------");
        System.out.println("horizontalOrder()");
        traversal.horizontalOrder(node1);
    }
}