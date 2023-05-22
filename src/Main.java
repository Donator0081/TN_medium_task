public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(80);
        Node node2 = new Node(30);
        Node node3 = new Node(120);
        node1.left = node2;
        node1.right = node3;
        Node node4 = new Node(25);
        Node node5 = new Node(35);
        node2.left = node4;
        node2.right = node5;
        Node node6 = new Node(115);
        Node node7 = new Node(125);
        node3.left = node6;
        node3.right = node7;
        System.out.println("preOrder()");
        node1.recPreOrder();
        System.out.println("----------");
        System.out.println("inOrder()");
        node1.recInOrder();
        System.out.println("----------");
        System.out.println("postOrder()");
        node1.recPostOrder();
    }
}