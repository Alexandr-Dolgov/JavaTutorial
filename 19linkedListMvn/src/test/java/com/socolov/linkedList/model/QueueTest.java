package com.socolov.linkedList.model;

import com.sokolov.linkedList.Queue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by AK on 29.05.2016.
 */
public class QueueTest {
    @Test
    public void tes() {
        Queue queue = new Queue();
        queue.enqueue("j");
        queue.enqueue("jj");
        queue.enqueue("123");
        Object o = new Object();
        queue.enqueue(o);

        Assert.assertEquals("[" + o + ", 123, jj, j]", queue.toString());

        Assert.assertEquals(4, queue.getSize());

        Assert.assertEquals("j", queue.dequeue());
        Assert.assertEquals("jj", queue.dequeue());
        Assert.assertEquals("123", queue.dequeue());
        Assert.assertEquals(o, queue.dequeue());

        Assert.assertEquals(0, queue.getSize());

        Assert.assertNull(queue.dequeue());
    }

    @Test
    public void test_dequeFromEmptyQueue() {
        Queue queue = new Queue();
        Assert.assertNull(queue.dequeue());
    }
}
