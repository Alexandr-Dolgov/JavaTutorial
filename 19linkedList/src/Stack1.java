/**
 * Created by AK on 25.05.2016.
 */
public class Stack1 {

    private Node first = null;

    private class Node{
        Object value;
        Node next;
    }

    boolean push(Object o){
        Node newNode = new Node();
        newNode.value = o;
        newNode.next = first;
        first = newNode;
        return true;
    }

    Object pop(){
        if (first != null){
            Object val = first.value;
            first = first.next;
            return val;
        }
        return null;
    }
}
