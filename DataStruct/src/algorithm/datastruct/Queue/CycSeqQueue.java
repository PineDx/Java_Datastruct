package algorithm.datastruct.Queue;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/12-17:25
 */
public class CycSeqQueue implements Queue{
    private Object[] objects;
    private int front;
    private int end;
    private int cap;

    public CycSeqQueue(int cap) {
        this.cap = cap;
        objects = new Object[cap];
        front = 0;
        end = 0;
    }
    @Override
    public int getSize() {
        return end-front;
    }
    @Override
    public Object dequeue() {
        if (front == end%cap){
            System.out.println("队列已空");
            return null;
        }
        Object ele = objects[front];
        front = (front+1)%cap;
        return ele;

    }
    @Override
    public void enqueue(Object el) {
        if ((end+1)%cap == front){
            System.out.println("队列已满");
            return;
        }
        objects[end%cap] = el;
        end = (end+1)%cap;
    }

    @Override
    public Object getFront() {
        if (front == end%cap){
            System.out.println("队列已空");
            return null;
        }
        return objects[front];
    }
}
