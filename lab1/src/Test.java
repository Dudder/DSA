/**
 * Created by Dudder on 2017.03.27..
 */
public class Test {

    public static void main(String[] args){

        //Doubly linked list test
        DoublyLinkedList dll = new DoublyLinkedList<>();
            dll.add("brown");
            dll.clear();
            dll.add("brown");
            dll.add("green");
            dll.add("blue");
        System.out.println(dll.elementAt(dll.first()));
        System.out.println(dll.elementAt(dll.middle()));
        System.out.println(dll.elementAt(dll.last()));
        dll.set(dll.first(),"dark-brown");
        System.out.println(dll.elementAt(dll.first()));
        dll.insert("black",null);
        System.out.println(dll.elementAt(dll.first()));


        //Queue test
        Queue q = new Queue();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        System.out.println(q.size());
        System.out.println(q.first());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("D");
        q.enqueue("E");
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.first());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());

//        //Double queue test
//
//        DoubleQueue dq = new DoubleQueue();;
//        dq.enqueueHead(1);
//        dq.enqueueTail(2);
//        System.out.println(dq.peekHead());
//        System.out.println(dq.peekTail());
//        dq.enqueueHead(3);
//        dq.enqueueTail(4);
//        System.out.println(dq.dequeueHead());
//        System.out.println(dq.dequeueHead());
//        System.out.println(dq.dequeueTail());
//        System.out.println(dq.dequeueTail());

    }
}
