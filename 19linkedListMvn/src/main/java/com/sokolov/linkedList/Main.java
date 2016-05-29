package com.sokolov.linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //[a, ab, bc]
        Stack stack2 = new Stack();
//        stack2.push(new Object());
//        stack2.push(new ArrayList<Integer>(){{add(1);add(3);}});
        stack2.push("bc");
        stack2.push("ab");
        stack2.push("a");
        System.out.println(stack2);
        System.out.println(stack2.get(1));
        System.out.println(stack2.get(3));
        System.out.println(stack2.get(2));

        Stack stack = new Stack();
        stack.push("b");
        Object obj = stack.pop();
        System.out.println(obj);

        Queue queue = new Queue();
        queue.enqueue("a");
        queue.enqueue("s");
        queue.enqueue("d");
        queue.enqueue("f");
        Object obj1 = queue.dequeue();
        System.out.println(obj1);
        System.out.println(queue);

    }
}
