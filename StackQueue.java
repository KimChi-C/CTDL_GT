import java.util.Queue;
import java.util.LinkedList;

public class StackQueueJava {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for (Integer integer : myQueue) {
            System.out.println(integer);
        }
        System.out.println("IsEmpty: " + myQueue.isEmpty());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Remove: " + myQueue.remove());

        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Remove: " + myQueue.remove());

        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Remove: " + myQueue.remove());

        System.out.println("IsEmpty: " + myQueue.isEmpty());
    }
}