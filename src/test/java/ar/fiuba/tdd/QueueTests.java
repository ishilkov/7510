package ar.fiuba.tdd;

import ar.fiuba.tdd.queue.BasicQueue;
import ar.fiuba.tdd.queue.Queue;

import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

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
    public void topItem() {

        Queue<String> queue = new BasicQueue<String>();

        queue.add("S1");
        queue.add("S2");

        assertEquals(queue.top(), "S1");
    }

    @Test(expected = AssertionError.class)
    public void topItemFromEmptyQueue() {

        Queue<String> queue = new BasicQueue<String>();

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
    public void removeItem() {

        Queue<String> queue = new BasicQueue<String>();

        queue.add("S1");

        queue.remove();

        assertEquals(queue.isEmpty(), true);
    }

    @Test(expected = AssertionError.class)
    public void removeItemFromEmptyQueue() {

        Queue<String> queue = new BasicQueue<String>();

        queue.remove();
    }
}
