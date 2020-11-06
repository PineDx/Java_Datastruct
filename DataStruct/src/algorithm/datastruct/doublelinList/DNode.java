package algorithm.datastruct.doublelinList;


/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/6-15:48
 */
public class DNode {
    private Object element; //结点元素
    private DNode prior;    // 指向前一个
    private DNode next;     // 指向下一个

    public DNode(){
        this.element = null;
        this.prior = null;
        this.next = null;
    }
    public DNode(Object ele){
        this.element = ele;
        this.next = null;
        this.prior = null;
    }
    public DNode(Object element, DNode prior, DNode next) {
        this.element = element;
        this.prior = prior;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DNode getPrior() {
        return prior;
    }

    public void setPrior(DNode prior) {
        this.prior = prior;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "element=" + element +
                ", prior=" + prior.element +
                ", next=" + next.element +
                '}';
    }
}
