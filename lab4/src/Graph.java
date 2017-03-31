/**
 * Created by Dudder on 2017.03.29..
 */
public class Graph<E> implements IGraph<E> {

    private DoublyLinkedList<Vertex> vertices;
    private DoublyLinkedList<Edge> edges;

    public Graph(){
        vertices = new DoublyLinkedList<>();
        edges = new DoublyLinkedList<>();
    }
    public boolean adjacent(Vertex v, Vertex u){
        return v.getAdjacent().exists(u);
    }
    public DoublyLinkedList<Vertex> neighbors(Vertex v) {
        return v.getAdjacent();
    }
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    public void removeVertex(Vertex v){

        Node node = edges.first();
        while(node!=null){
            Edge e = (Edge) node.getData();
            if(e.getU() == v){
                e.getU().removeAdjacent(v);
                edges.remove((Edge) node.getData());
            }
            if(e.getV() == v){
                e.getV().removeAdjacent(v);
                edges.remove((Edge) node.getData());
            }
            node = node.getNext();
        }
        vertices.remove(v);
    }
    public void addEdge(Vertex v,Vertex u,E value){
        Edge e = new Edge(v,u);
        e.setValue(value);
        edges.add(e);
        u.addAdjacent(v);
        v.addAdjacent(u);
    }
    public void removeEdge(Edge e){
        edges.remove(e);
        e.getV().getAdjacent().remove(e.getU());
        e.getU().getAdjacent().remove(e.getV());
    }
    public E getVertexValue(Vertex v){
        return (E) v.getElement();
    }
    public void setVertexValue(Vertex v,E e){
        v.setElement(e);
    }
    public E getEdgeValue(Edge e){
        return (E) e.getValue();
    }
    public void setEdgeValue(Edge e,E value){
        e.setValue(value);
    }
    public Vertex findVertex(E e){
        Node node = vertices.first();
        while(node!=null){
            Vertex x = (Vertex) node.getData();
            if(x.getElement()== e){
                return (Vertex) node.getData();
            }
            node = node.getNext();
        }
        return null;
    }
    public DoublyLinkedList<Vertex> getVertices() {
        return vertices;
    }

    public DoublyLinkedList<Edge> getEdges() {
        return edges;
    }
}
