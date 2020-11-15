package algorithm.datastruct.linkedList;

/**
 * <结点>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/4-20:43
 */
public class Node {
    private Object element; //结点数据的引用
    private Node next;      //下一个结点的对象引用

    public Node(Node nextNode){
        this.next = nextNode;
    }
    public Node(Object ele){
        this.element = ele;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
