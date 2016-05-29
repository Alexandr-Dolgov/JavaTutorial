package com.socolov.linkedList.model;

import com.sokolov.linkedList.Queue;
import org.junit.Test;

/**
 * Created by AK on 29.05.2016.
 */
public class QueueTest {
    @Test
    public void test() {
        Queue queue = new Queue();
        queue.enqueue("j");
        queue.enqueue("jj");
        queue.enqueue("123");
        queue.enqueue(new Object());

        for (int i = 1; i <= queue.getSize() + 1; i++) {
            queue.dequeue();
        }
    }
}
