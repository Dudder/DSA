/**
 * Created by Dudder on 2017.03.27..
 */
public interface List<E> {
    void clear();
    void insert(E e, Node before);
    void add(E e);
    void set(Node node, E data);
    void remove(Node node);
    Node first();
    Node last();
    Node middle();
    Object elementAt(Node node);
    int size();
    boolean isEmpty();
}

