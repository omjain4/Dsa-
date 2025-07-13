import java.util.PriorityQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);


        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();



//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(87);
//        queue.insert(97);
//        queue.insert(7);
//        queue.insert(85);
//        queue.insert(8);
//
//        queue.remove();
//        queue.display();
    }
}
