package ar.fiuba.tdd;

import ar.fiuba.tdd.linkedlist.EmptyElementException;
import ar.fiuba.tdd.queue.BasicQueue;
import ar.fiuba.tdd.queue.Queue;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;


public class QueueTests {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void addItem() {

        Queue<String> queue = new BasicQueue<String>();

        assertEquals(queue.size(), 0);

        queue.add("S1");
        queue.add("S2");

        assertEquals(queue.size(), 2);
    }

    @Test
    public void topItem() throws EmptyElementException {

        Queue<String> queue = new BasicQueue<String>();

        queue.add("S1");
        queue.add("S2");

        assertEquals(queue.top(), "S1");
    }

    @Test
    public void topItemFromEmptyQueue() throws EmptyElementException {

        Queue<String> queue = new BasicQueue<String>();

        exception.expect(Exception.class);
        queue.top();
    }

    @Test
    public void checkQueueIsEmpty() {

        Queue<String> queue = new BasicQueue<String>();

        assertEquals(queue.isEmpty(), true);

        queue.add("S1");

        assertEquals(queue.isEmpty(), false);
    }

    @Test
    public void removeItem() throws EmptyElementException {

        Queue<String> queue = new BasicQueue<String>();

        queue.add("S1");

        queue.remove();

        assertEquals(queue.isEmpty(), true);
    }

    @Test
    public void removeItemFromEmptyQueue() throws EmptyElementException {

        Queue<String> queue = new BasicQueue<String>();

        exception.expect(Exception.class);
        queue.remove();
    }
}
