/**
 * Created by Dudder on 2017.03.27..
 */
public class DoublyLinkedList<E> implements List<E> {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    public void add(E data){
        size++;
        Node node = new Node(data);
        if (first == null){
            first = node;
            last = node;
        }else{
            last.setNext(node);
            node.setPrevious(last);
            last = node;
        }
    }
    public Node first(){
        return first;
    }
    public Node last(){
        return last;
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    public void insert(E e, Node before){
        size++;
        Node node = new Node(e);
        if(before == null){
            first.setPrevious(node);
            node.setNext(first);
            first = node;
        }else{
            node.setNext(before.getNext());
            before.getNext().setPrevious(node);
            node.setPrevious(before);
            before.setNext(node);
        }
    }

    public void set(Node node, E data){
        node.setData(data);
    }

    public void remove(Node node){
        if(node == first && size>1){
            first = node.getNext();
        }
        else if(node != first){
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
        }else{
            clear();
        }
    }

    public Object elementAt(Node node){
        return node.getData();
    }

    public Node middle(){
        Node asc = first;
        Node dsc = last;
        while(asc != dsc && asc.getNext()!= null && dsc.getPrevious()!= null){
            asc = asc.getNext();
            dsc = dsc.getPrevious();
            if(asc == dsc){
                return asc;
            }
        }
        return null;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
}
