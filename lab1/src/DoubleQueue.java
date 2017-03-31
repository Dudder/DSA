/**
 * Created by Dudder on 2017.03.27..
 */
public class DoubleQueue<E> implements IDoubleQueue<E>{

    DoublyLinkedList dll;

    public DoubleQueue(){
        dll = new DoublyLinkedList();
    }
    public Object dequeueHead(){
        Object o = dll.elementAt(dll.first());
        dll.remove(dll.first());
        return o;
    }
    public Object dequeueTail(){
        Object o = dll.elementAt(dll.last());
        dll.remove(dll.last());
        return o;
    }
    public void enqueueHead(E e){
        dll.insert(e,null);
    }
    public void enqueueTail(E e){
        dll.insert(e, dll.last());
    }
    public boolean isEmpty(){
        return dll.isEmpty();
    }
    public Object peekHead(){
        return dll.elementAt(dll.first());
    }
    public Object peekTail(){
        return dll.elementAt(dll.last());
    }
    public int size(){
        return dll.size();
    }
}
