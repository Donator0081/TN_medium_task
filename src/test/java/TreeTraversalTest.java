import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalTest {

    private final TreeTraversal traversal = new TreeTraversal();

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
    @Test
    void recPreOrder() {
        traversal.recPreOrder(TestTreeData.NODE1);
        assertEquals("80 30 25 35 120 115 125 ",outputStreamCaptor.toString());
    }

    @Test
    void recInOrder() {
        traversal.recInOrder(TestTreeData.NODE1);
        assertEquals("25 30 35 80 115 120 125 ",outputStreamCaptor.toString());
    }

    @Test
    void recPostOrder() {
        traversal.recPostOrder(TestTreeData.NODE1);
        assertEquals("25 35 30 115 125 120 80 ",outputStreamCaptor.toString());
    }

    @Test
    void horizontalOrder() {
        traversal.horizontalOrder(TestTreeData.NODE1);
        assertEquals("80 30 120 25 35 115 125 ",outputStreamCaptor.toString());
    }
}