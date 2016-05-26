public class Stack { //стэк - стопка элементов. последний пришедший первым выйдет

    private int size = 0;

    private Node first = null;//head - голова

    private class Node { //узел
            Object value;   //значение
            Node next;      //ссылка на следующий узел
        }

    boolean push(Object o) { //положить (втолкнуть) элемент на вершуны стека
        Node newNode = new Node();
        newNode.value = o;
        newNode.next = first;
        first = newNode;
        size++;
        return true;
    }

    Object pop() { //взять (вытолкнуть) элемент с вершины стека
        if (first != null) {
            Object val = first.value;
            first = first.next;
            size--;
            return val;
        }
        return null;
    }

    int size(){ // сложность O(1)
        return size;
    }

    int size2() { // сложность O(N)
        Node current = first;
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
