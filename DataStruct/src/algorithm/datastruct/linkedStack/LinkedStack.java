package algorithm.datastruct.linkedStack;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/10-15:20
 */
public class LinkedStack {
    private StackNode top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }
    public void push(Object ele){
        StackNode node = new StackNode();
        node.setElement(ele);
        node.setNextNode(top);
        top = node;
        size++;
    }

    public Object pop(){
        if (size < 0){
            return null;
        }
        Object o = top.getElement();
        top = top.getNextNode();
        size--;
        return o;
    }

    public Object getTop(){
        if (size < 0){
            return null;
        }
        return top.getElement();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return top==null | size ==0;
    }

    public void setEmpty(){
        top = null;
        size = 0;
    }
}
