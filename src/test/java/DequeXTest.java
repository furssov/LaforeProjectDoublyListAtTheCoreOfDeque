import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeXTest {

    DequeX dequeX;

    @BeforeEach
    void setUp() {
    dequeX = new DequeX();
    dequeX.add(10);
    dequeX.add(0);
    dequeX.add(20);
    dequeX.add(-10);
    }

    @Test
    void insertFirst() {
        dequeX.insertFirst(111);
        dequeX.insertFirst(222);
        assertEquals(222, dequeX.deleteFirst());
    }

    @Test
    void deleteFirst() {
        assertEquals(10, dequeX.deleteFirst());
        assertEquals(0, dequeX.deleteFirst());
        dequeX.insertFirst(55);
        assertEquals(55, dequeX.deleteFirst());
    }

    @Test
    void delete() {
       assertEquals(-10, dequeX.delete());
       assertEquals(20, dequeX.delete());
       dequeX.add(55);
       assertEquals(55, dequeX.delete());
    }


}