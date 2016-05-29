package com.socolov.linkedList.model;

import com.sokolov.linkedList.Stack;
import org.junit.Test;

/**
 * Created by AK on 27.05.2016.
 */
public class StackTest {

    @Test
    public void test() {
        Stack stack = new Stack();
        stack.push("i");
        stack.push("ii");
        stack.push(111);
        stack.push(new Object());
        System.out.println(stack);
        for (int i = 1; i <= stack.getSize() + 1; i++) {
            stack.pop();
        }
    }
}
