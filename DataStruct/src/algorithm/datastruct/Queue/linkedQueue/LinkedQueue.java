package algorithm.datastruct.Queue.linkedQueue;

import algorithm.datastruct.Queue.Queue;

/**
 * <链式队列>
 * <入队，出队，获取队头元素，获取大小>
 *
 * @Author: Songlin
 * @create: 2020/11/14-18:58
 */
public class LinkedQueue implements Queue {
    private int size;
    private QueueNode front;
    private QueueNode rear;

    public LinkedQueue(){
        this.size = 0;
        this.front = new QueueNode();
        this.rear = front;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object dequeue(){
        if (size < 1){
            System.out.print("The Queue is Empty!");
            return null;
        }
        QueueNode node = front.getNextNode();
        front.setNextNode(node.getNextNode());
        size--;
        if (size < 1){
            rear = front;
        }
        Object o = node.getEle();
        return o;
    }

    @Override
    public void enqueue(Object el) {
        QueueNode node = new QueueNode();
        node.setEle(el);
        rear.setNextNode( node );
        node.setNextNode( null );
        rear = node;
        size++;
    }

    @Override
    public Object getFront() {
        if (size < 1){
            return null;
        }
        return front.getNextNode().getEle();
    }
}
