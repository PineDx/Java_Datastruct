package Test.datastruct.linked;

import algorithm.datastruct.Queue.linkedQueue.LinkedQueue;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/14-19:27
 */
public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println("size:"+linkedQueue.getSize());
        System.out.println("QueueFront:"+linkedQueue.dequeue()+"\tout");
        linkedQueue.enqueue(4);
        System.out.println("QueueFront:"+linkedQueue.dequeue()+"\tout");
        System.out.println("QueueFront:"+linkedQueue.getFront()+"\t scan");
        System.out.println("QueueFront:"+linkedQueue.dequeue()+"\tout");
        System.out.println("QueueFront:"+linkedQueue.dequeue()+"\tout");
        System.out.println("QueueFront:"+linkedQueue.dequeue()+"\tout");
    }
}
