package com.sokolov.linkedList;

public class Stack { //стэк - стопка элементов. последний пришедший первым выйдет

    private int size = 0;

    private Node top = null;//head - голова

    private class Node { //узел
        Object value;   //значение
        Node next;      //ссылка на следующий узел
    }

    public boolean push(Object o) { //положить (втолкнуть) элемент на вершуны стека
        Node newNode = new Node();
        newNode.value = o;
        newNode.next = top;
        top = newNode;
        size++;
        return true;
    }

    public Object pop() { //взять (вытолкнуть) элемент с вершины стека
        if (top != null) {
            Object val = top.value;
            top = top.next;
            size--;
            return val;
        }
        return null;
    }

    @Override
    public String toString() {
        //[a, ab, bc]
        String s = "[";
        if (top == null) {
            return s + "]";
        }
        Node currentNode = top;
        while (currentNode.next != null) {
            s += currentNode.value.toString() + ", ";
            currentNode = currentNode.next;
        }
        s += currentNode.value.toString();
        return s + "]";
    }

    public Object get(int index){
        int currentNodeIndex = 0;

        if (top == null || index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = top;
        while (currentNode != null){
            if (index == currentNodeIndex) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            currentNodeIndex++;
        }
        throw new RuntimeException("incorrect algorithm");//до этой строчки не должны дойти
    }

    public int getSize() { // сложность O(1)
        return size;
    }

    int size2() { // сложность O(N)
        Node current = top;
        if (current == null) {
            return 0;
        }
        int i = 0;
        while (current.next != null) {
            i++;
            current = current.next;

        }
        return i;
    }


}
