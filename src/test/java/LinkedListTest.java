import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList<Integer> list;
    @BeforeEach
    void setUp() {
        list = new LinkedList<>();
        list.add(1);
        list.add(-1);
        list.add(5);
        list.add(3);
    }

    @Test
    void insertFirst() {
        list.displayList();
        System.out.println();
        list.insertFirst(22);
        list.displayList();
    }

    @Test
    void deleteFirst() {
        assertTrue(list.deleteFirst());
        list.displayList();
    }

    @Test
    void delete() {
        assertTrue(list.delete());
        list.displayList();
        assertTrue(list.delete());
        assertTrue(list.delete());
        assertTrue(list.delete());
        System.out.println();
        assertFalse(list.delete());
        list.displayList();
    }
}