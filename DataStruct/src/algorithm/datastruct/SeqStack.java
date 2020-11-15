package algorithm.datastruct;

/**
 * <数据栈>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/10-14:14
 */
public class SeqStack {
    // 最大栈长
    private final static int MAX_STACK_SIZE = 10;
    // 栈顶指针
    public int top;
    /**
     * Object 类型数组
     */
    private Object[] objects;

    /**
     * 初始化栈，默认最大值
     */
    public SeqStack() {
        this.top = -1;
        this.objects = new Object[MAX_STACK_SIZE];
    }

    /**
     * 自定义大小的栈
     * @param size
     */
    public SeqStack(int size){
        this.top = -1;
        this.objects = new Object[size];
    }

    /**
     * 返回栈的大小
     * @return int
     */
    public int getSize(){
        return top+1;
    }

    /**
     * 栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 压栈操作，栈满时返回
     * @param ele
     * @return
     */
    public boolean push(Object ele){
        if(top+1>=objects.length) {
            System.out.println("栈满,无法压入元素");
            return false;
        }else{
            objects[++top] = ele;
            return true;
        }
    }

    /**
     * 弹栈操作，栈空时返回
     * @return
     */
    public Object pop(){
        if(top<0){
            return false;
        }else{
            return objects[top--];
        }
    }

    /**
     * 获取栈顶元素，但不删除
     * @return
     */
    public Object getTop(){
        return top>-1?objects[top]:null;
    }

    /**
     * 清空栈
     */
    public void setEmpty(){
        top = -1;
    }

    public void showStack(){
        for (Object o :
                objects) {
            System.out.println(o);
        }
    }

}
