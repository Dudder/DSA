import java.util.Stack;

/**
 * Created by Dudder on 2017.03.27..
 */
public class Queue<E> implements IQueue<E>{

    private E first;
    private int size;
    private Stack enqueues;
    private Stack dequeues;

    public Queue(){
        enqueues = new Stack();
        dequeues = new Stack();
        size = 0;
    }

    public void enqueue(E e){
        size++;
        if(enqueues.isEmpty()) {
            first = e;
        }
        enqueues.push(e);
    }

    public Object dequeue(){
        size--;
        if(dequeues.isEmpty()) {
            while (!enqueues.isEmpty()) {
                dequeues.push(enqueues.pop());
            }
            return (dequeues.pop());
        }else{
            return (dequeues.pop());
        }
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public Object first(){
        if(dequeues.isEmpty()){
            return first;
        }else{
            return dequeues.peek();
        }
    }
    public int size(){
        return size;
    }
}
