
package test;
import list.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinkedListTests {


    @Test
    public void testAddLastABC() {

        // Arrange
        List<String> list = new LinkedList<>();

        // Act
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        
        // Assert
        String expected = "size: 3 head: null tail: C [A,B,C,]";
        String actual = list.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        // Arrange
        List<Double> list = new LinkedList<>();

        // Act
        list.addLast(0.2);

        // Assert
        int expected = 1;
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        // Arrange
        List<Integer> list = new LinkedList<>();

        // Act
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        boolean actual = list.contains(4);

        // Assert
        boolean expected = true;

        assertEquals(expected, actual);
        assertTrue(actual);
    }

    @Test
    public void testAddFirst() {
        // Arrange
        List<Boolean> list = new LinkedList<>();

        // Act
        list.addFirst(true);
        list.addFirst(false);

        // Assert
        String expected = "size: 2 head: null tail: true [false,true,]";
        String actual = list.toString();
        assertEquals(expected, actual);


    }

    @Test
    public void testAddAtIndex() {
        // Arrange
        List<String> list = new LinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addFirst("C");

        // Act
        list.addAtIndex("D", 1);

        // Assert
        String expected = "size: 4 head: null tail: B [C,D,A,B,]";
        String actual = list.toString();
        assertEquals(expected, actual);

    }


}
