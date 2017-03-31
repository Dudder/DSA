/**
 * Created by Dudder on 2017.03.27..
 */
public class Node<E>{

    private E data;
    private Node next = null;
    private Node previous = null;

    public Node(E data){
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setData(E data) {
        this.data = data;
    }
}