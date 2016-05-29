package com.sokolov.linkedList;

public class Queue {

    private Node top = null;
    private Node back = null;
    private int size = 0;

    private class Node{
        Object value;
        Node next;
    }

    public void enqueue(Object o){
        Node newNode = new Node();
        newNode.value = o;
        newNode.next = top;
        if (top == null) {
            top = newNode;
    } else {
            newNode.next = back;
        }
        back = newNode;
        size++;
    }

    public Object dequeue(){
        if (top != null){
            Object val = top.value;
            size--;
            top = top.next;
            return val;
        }
        return null;

    }

    @Override
    public String toString(){
        String s = "[";
        if (back == null){
            return s + "]";
        }
        Node currentNode = back;
        while (currentNode.next != null){
            s += currentNode.value.toString() + ", ";
            currentNode = currentNode.next;
        }
        s += currentNode.value.toString();
        return s + "]";
    }


    public int getSize(){return size;}
}
