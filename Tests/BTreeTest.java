
import BinaryTree.BinaryTree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BTreeTest {

    private BinaryTree tree = new BinaryTree();

    @Test
    public void subSetTest() {
        newTestingTree();
        assertEquals(new TreeSet<>(Arrays.asList(5)), tree.subSet(5, 6));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9)), tree.subSet(0, 10));
        assertEquals(new TreeSet<>(Arrays.asList()), tree.subSet(6, 7));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2)), tree.subSet(-3, 3));
    }

    @Test
    public void tailSetTest() {
        newTestingTree();
        assertEquals(new TreeSet<>(Arrays.asList(9)), tree.tailSet(9));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9)), tree.tailSet(0));
        assertEquals(new TreeSet<>(Arrays.asList(7, 8, 9)), tree.tailSet(6));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9)), tree.tailSet(-3));
    }

    @Test
    public void testHeadSet() {
        newTestingTree();
        assertEquals(new TreeSet<>(Arrays.asList(1, 2)), tree.headSet(3));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8)), tree.headSet(9));
        assertEquals(new TreeSet<>(Arrays.asList()), tree.headSet(1));
        assertEquals(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5)), tree.headSet(6));
    }

    private void newTestingTree() {
        List<Integer> list = Arrays.asList(3, 7, 4, 9, 5, 1, 2, 8);
        tree.addAll(list);
    }
}
