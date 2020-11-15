package algorithm.datastruct.Queue.linkedQueue;

/**
 * <队列节点>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/14-18:56
 */
public class QueueNode {
    private Object ele;
    private QueueNode nextNode;

    public Object getEle() {
        return ele;
    }

    public void setEle(Object ele) {
        this.ele = ele;
    }

    public QueueNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(QueueNode nextNode) {
        this.nextNode = nextNode;
    }
}
