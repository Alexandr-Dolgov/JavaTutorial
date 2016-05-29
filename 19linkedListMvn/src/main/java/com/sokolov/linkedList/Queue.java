package com.sokolov.linkedList;

/**
 * Created by AK on 25.05.2016.
 */
/*
1. Повторить класс Stack не подсматривая в реализацию.
2. Сделать класс Очередь (Queue)
с полями
    top//перед очереди из которого мы берем элементы
    back//зад очереди, в который мы вставляем элементы
с методами
    void enqueue(Object o)  //вставка элемента
    Object dequeue() //взятие элемента
    int size() //возвращяющий количество элементов в очереди
 */
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
