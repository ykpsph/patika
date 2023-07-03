package Java102.QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("name1");
        q.add("name2");
        q.offer("name3");
        // remove():retrieves and removes the head of this queue
        // if the queue is empty it throws an exception.
        System.out.println("remove(): "+q.remove());
        // element(): retrieves the head of the queue.
        // if the queue is empty it throws an exception.
        System.out.println("element(): "+q.element());
        // poll(): returns and removes the head of this queue
        // if the queue is empty returns null.
        System.out.println("poll(): "+q.poll());

        // retrieves the head of this queue.
        // if the queue is empty returns null.
        System.out.println("peek(): "+q.peek());

        q.add("name4");
        q.add("name5");
        q.add("name6");

        Iterator<String> iterator = q.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
