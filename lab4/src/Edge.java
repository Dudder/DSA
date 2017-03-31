/**
 * Created by Dudder on 2017.03.29..
 */
public class Edge<E> {

    private E value;
    private Vertex u;
    private Vertex v;

    public Edge(Vertex v,Vertex u){
        this.v = v;
        this.u = u;
    }
    public E getValue() {
        return value;
    }

    public Vertex getU() {
        return u;
    }

    public Vertex getV() {
        return v;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
