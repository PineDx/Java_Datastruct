package algorithm.datastruct.Queue;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/12-17:23
 */
public interface Queue {
    public int getSize();
    public Object dequeue();
    public void enqueue(Object el);
    public Object getFront();
}
