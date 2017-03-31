/**
 * Created by Dudder on 2017.03.29..
 */
public interface IGraph<E> {

    DoublyLinkedList<Vertex> getVertices();
    boolean adjacent(Vertex v,Vertex u);
    DoublyLinkedList<Vertex> neighbors(Vertex v);
    void addVertex(Vertex v);
    void removeVertex(Vertex v);
    void addEdge(Vertex v,Vertex u,E value);
    void removeEdge(Edge e);
    E getVertexValue(Vertex v);
    void setVertexValue(Vertex v,E e);
    E getEdgeValue(Edge e);
    void setEdgeValue(Edge e,E value);
    Vertex findVertex(E e);
}
