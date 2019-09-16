import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {

    CP3LinkedList<String>  myList = new CP3LinkedList();

        myList.addFirst("Karen");
        





    }

    @Test
    void getFirst() {

        CP3LinkedList<String> myList = new CP3LinkedList();

        Assertions.assertThrows(NoSuchElementException.class, ()->myList.getFirst());
    }

    @Test
    void removeFirst() {

        CP3LinkedList<String> myList = new CP3LinkedList();

        myList.addFirst("Karen");
        myList.addFirst("Mary");
        myList.addFirst("Jess");

        myList.removeFirst();
        String x = myList.getFirst();
        String expected = "Mary";


        assertEquals(expected,x);




    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        boolean actual = myList.isEmpty();
        assertEquals(true,actual);

        myList.addFirst("Karen");
        actual = myList.isEmpty();
        assertEquals(false,actual);


    }

    @Test
    void size() {

        CP3LinkedList<String> myList = new CP3LinkedList();

        myList.addFirst("Karen");
        myList.addFirst("Mary");
        myList.addFirst("Jess");

        int x = myList.size();

        int expect = 3;

        assertEquals(expect, x);

    }

}