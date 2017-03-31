/**
 * Created by Dudder on 2017.03.27..
 */
public interface IDoubleQueue<E> {

    Object dequeueHead();
    void enqueueHead(E e);
    Object dequeueTail();
    void enqueueTail(E e);
    boolean isEmpty();
    Object peekHead();
    Object peekTail();
    int size();
}
