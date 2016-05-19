public class LL { //LinkedList // односвязный список с выделенной головой

    private class Node { //узел списка
        Object value;   //значение
        Node next;      //ссылка на следующий узел
    }

    Node first = null;

    boolean add(Object o) {
        Node oldFirst = first;

        Node newNode = new Node();
        newNode.value = o;
        newNode.next = null;

        first = newNode;

        return true;
    }

}
