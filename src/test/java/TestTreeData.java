public class TestTreeData {

    public static Node NODE1 = new Node(80);
    public static Node NODE2 = new Node(30);
    public static Node NODE3 = new Node(120);
    public static Node NODE4 = new Node(25);
    public static Node NODE5 = new Node(35);
    public static Node NODE6 = new Node(115);
    public static Node NODE7 = new Node(125);

    static {
        NODE1.setLeft(NODE2);
        NODE1.setRight(NODE3);
        NODE2.setLeft(NODE4);
        NODE2.setRight(NODE5);
        NODE3.setLeft(NODE6);
        NODE3.setRight(NODE7);
    }
}
