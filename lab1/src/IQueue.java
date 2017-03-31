/**
 * Created by Dudder on 2017.03.27..
 */
public interface IQueue<E> {

    Object dequeue();
    void enqueue(E e);
    boolean isEmpty();
    Object first();
    int size();
}
