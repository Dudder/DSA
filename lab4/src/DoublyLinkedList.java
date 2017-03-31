/**
 * Created by Dudder on 2017.03.27..
 */
public class DoublyLinkedList<E> implements List<E>{

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

    public void remove(E e){
        Node node = first();
        while(node!=null){
            if(node.getData().equals(e)){
                if(node == first && size>1){
                    first = node.getNext();
                }
                else if(node == last){
                    node.getPrevious().setNext(null);
                    last = node.getPrevious();
                }
                else if(node != first && node != last){
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                }else{
                    clear();
                }
                break;
            }
            node = node.getNext();
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

    public boolean exists(E e) {
        Node node = first();
        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getData().equals(e)) {
                return true;
            }
        }
        return false;
    }
    public E find(E e){
        Node node = first();
        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getData().equals(e)) {
                return (E) node.getData();
            }
        }
        return null;
    }
    public String toString(){
        String string = new String();
        string += "[";
        Node node = first;
        while (node!=null){
            Vertex v = (Vertex) node.getData();
            string+= v.getElement();
            if(node==last){
                string+= "]";
            }else{
                string+= ",";
            }
            node = node.getNext();
        }
        return string;
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
