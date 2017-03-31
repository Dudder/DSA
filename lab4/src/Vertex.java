/**
 * Created by Dudder on 2017.03.29..
 */
public class Vertex<E> {

    private E element;
    private DoublyLinkedList<Vertex> adjacent;

    public Vertex(E element){
        this.element = element;
        adjacent = new DoublyLinkedList<>();
    }

    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }
    public void addAdjacent(Vertex v){
        adjacent.add(v);
    }
    public void removeAdjacent(Vertex v){
        adjacent.remove(v);
    }
    public DoublyLinkedList<Vertex> getAdjacent() {
        return adjacent;
    }
}
