package Test.datastruct.linked;

import algorithm.datastruct.Queue.CycSeqQueue;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/12-19:49
 */
public class CycQueueTest {
    public static void main(String[] args) {
        /**
         * 数组循环队列牺牲一个空间
         */
        CycSeqQueue cycSeqQueue = new CycSeqQueue(5);

        System.out.println("入队");
        cycSeqQueue.enqueue(1);
        cycSeqQueue.enqueue(2);
        cycSeqQueue.enqueue(3);
        cycSeqQueue.enqueue(4);
//        cycSeqQueue.enqueue(5);  // 队列已满
        System.out.println("队列元素:"+cycSeqQueue.getSize());
        System.out.println("-----出队列-------");
        System.out.println(cycSeqQueue.dequeue());
        System.out.println(cycSeqQueue.dequeue());
        System.out.println(cycSeqQueue.dequeue());
        System.out.println("剩余元素:"+cycSeqQueue.getSize());
        cycSeqQueue.enqueue(1);
        cycSeqQueue.enqueue(2);
        System.out.println("目前队列头："+cycSeqQueue.getFront());
        System.out.println(cycSeqQueue.dequeue());
        System.out.println(cycSeqQueue.dequeue());
        System.out.println(cycSeqQueue.dequeue());
        System.out.println(cycSeqQueue.dequeue());

    }
}
