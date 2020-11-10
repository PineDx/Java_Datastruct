package algorithm.datastruct.linkedStack;

/**
 * <栈结构节点>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/10-15:18
 */
public class StackNode {
    private Object element;
    private StackNode nextNode;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public StackNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(StackNode nextNode) {
        this.nextNode = nextNode;
    }
}
