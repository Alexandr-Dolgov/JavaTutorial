/**
 * Created by AK on 25.05.2016.
 */
/*
1. Повторить класс Stack не подсматривая в реализацию.
2. Сделать класс Очередь (Queue)
с полями
    front//перед очереди из которого мы берем элементы
    back//зад очереди, в который мы вставляем элементы
с методами
    void enqueue(Object o)  //вставка элемента
    Object dequeue() //взятие элемента
    int size() //возвращяющий количество элементов в очереди
 */
public class Queue {

    private Node front = null;
    private Node back = null;
    private int size = 0;

    private class Node{
        Object value;
        Node next;
    }

    public void enqueue(Object o){
        Node newNode = new Node();
        newNode.value = o;
        newNode.next = front;
        if (front == null) {
            newNode.next = back;
            front = newNode;
        }
        back = newNode;

        size++;
    }

    public Object dequeue(){
        if (front != null){
            Object val = front.value;
            size--;
            front = front.next;
            return val;
        }
        return null;

    }

    int size(){return size;}
}
