import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Dudder on 2017.03.29..
 */
public class Test {

    public static void main(String[] args){

        //EXAMPLE DATA
        String[] vertices = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U"};
        Object[][] edges = {{"T","A",1},{"A","O",5},{"A","B",9},{"O","N",5},{"N","B",6},{"B","C",7},{"N","M",5},
                            {"M","F",3},{"F","C",4},{"M","Q",4},{"Q","L",6},{"F","L",7},{"F","G",5},{"G","D",6},
                            {"C","D",3},{"G","K",5},{"L","K",5},{"Q","R",4},{"R","K",2},{"G","H",2},{"H","D",5},
                            {"H","I",7},{"D","I",3},{"I","S",4},{"S","J",2},{"I","J",5},{"J","E",9},{"J","P",3},
                            {"R","P",6},{"E","K",3},{"P","U",1},{"P","E",1}};

        Graph graph = new Graph();

        for(String v : vertices){
            graph.addVertex(new Vertex(v));
        }
        for(Object[] e: edges){
            graph.addEdge(graph.findVertex(e[0]),graph.findVertex(e[1]),e[2]);
        }
        Stack<Vertex> solution = SimpleDijkstra(graph,graph.findVertex("T"),graph.findVertex("U"));
        while(solution.size()>0){
            System.out.print(solution.pop().getElement()+" ");
        }
    }

    public static Stack SimpleDijkstra(Graph g, Vertex source, Vertex target){

        int k = 5;


        //Init
        Stack stack = new Stack();
        HashMap<Vertex,Integer> distance = new HashMap<>();
        HashMap<Vertex, Vertex> previos = new HashMap<>();
        Node node = g.getVertices().first();
        while(node!= null){
            if((node.getData().equals(source))){
                distance.put(source,0);
            }else{
                distance.put((Vertex) node.getData(),k+1);
            }
            previos.put((Vertex) node.getData(),null);
            node = node.getNext();
        }
        //Main
        DoublyLinkedList vertices = g.getVertices();
        while(vertices.size()>0){
            Vertex v = findSmallestDistance(distance,vertices);
            vertices.remove(v);
            DoublyLinkedList neighbous = v.getAdjacent();
            node = neighbous.first();
            while(node!= null){
                int neighbour = distance.get((Vertex) node.getData());
                int parent = distance.get(v);
                if(neighbour+1<parent){
                    distance.replace(v,neighbour);
                    previos.put(v,(Vertex) node.getData());
                }
                node = node.getNext();
            }
            if(v.equals(target)){
                while(v!=null){
                    stack.push(v);
                    v = previos.get(v);
                }
                break;
            }
        }
        return stack;
    }

    public static Vertex findSmallestDistance(HashMap distance, DoublyLinkedList vertices){

        Node node = vertices.first();
        Vertex min = (Vertex) node.getData();
        while(node!= null){
            int d = (Integer) distance.get(node.getData());
            int mind = (Integer) distance.get(min);
            if(d< mind){
                min = (Vertex) node.getData();
            }
            node = node.getNext();
        }
        return min;
    }
}
