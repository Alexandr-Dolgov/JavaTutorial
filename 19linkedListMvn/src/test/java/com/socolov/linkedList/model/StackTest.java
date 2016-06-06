package com.socolov.linkedList.model;

import com.sokolov.linkedList.Stack;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void test_add_inTop() {
        Stack stack = new Stack();
        Assert.assertEquals("[]", stack.toString());
        stack.add(0, "q");
        Assert.assertEquals("[q]", stack.toString());
    }

    @Test
    public void test_add_index1() {
        Stack stack = new Stack();
        Assert.assertEquals("[]", stack.toString());
        stack.add(0, "q");
        Assert.assertEquals("[q]", stack.toString());
        stack.add(1, "w");
        Assert.assertEquals("[w, q]", stack.toString());
    }

    @Test
    public void test_add_incorrectIndex() {
        Stack stack = new Stack();
        Assert.assertEquals(0, stack.getSize());
        Assert.assertFalse(stack.add(-1, "q"));
        Assert.assertFalse(stack.add(1, "q"));
    }

    @Test
    public void test_toString() {
        Stack stack = new Stack();
        stack.push("z");
        stack.push("v");
        stack.push("w");
        Assert.assertEquals("[w, v, z]", stack.toString());
    }
}
