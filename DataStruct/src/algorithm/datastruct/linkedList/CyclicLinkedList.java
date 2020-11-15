package algorithm.datastruct.linkedList;

/**
 * <循环单链表>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/5-11:28
 */
public class CyclicLinkedList {
    public Node head; //头结点
    public Node current; // 当前结点的位置 相当于指针
    private int size; // 结点的大小

    // 初始化链表
    public CyclicLinkedList(){
        head = current = new Node(null);
        head.setNext(head);
        this.size = 0;
    }

    public void ShowList(){
        Node p = head;
        while(p.getNext() != head){
            p = p.getNext();
            System.out.println(p.getElement());
        }
        System.out.println("单链表大小"+this.size);
    }

    // 添加结点
    public void add(Node node){
        Node p = head;
        while(p.getNext() != head){
            p = p.getNext();
        }
        p.setNext(node);
        node.setNext(head);
        this.size++;
    }
    // 定位结点
    private void index(int i) throws Exception{
        int j = 0;
        this.current = this.head;
        // 移动临时指针的位置
        while(current.getNext() != head && j < i-1){
            current = current.getNext();
            j++;
        }
    }
    // 插入数据
    public void insert(int i, Object obj) throws Exception{
        // 位置小于0 或 位置大于链表总长度， 参数错误
        if (i <= 0 || i > size){
            throw new Exception("参数错误");
        }
        index(i);

        Node n = new Node(obj);
        n.setNext(current.getNext());
        current.setNext(n);
        this.size++;
    }

    // 删除元素
    public void delete(int i) throws Exception{
        // 位置小于0 或 位置大于链表总长度， 参数错误
        if (i <= 0 || i > size){
            throw new Exception("参数错误");
        }
        index(i);
        Node del = current.getNext();
        current.setNext(del.getNext());
        size--;


    }

    // 获取指定位置的元素
    public Node getNode(int i)throws Exception{
        // 位置小于0 或 位置大于链表总长度， 参数错误
        if (i <= 0 || i > size){
            throw new Exception("参数错误");
        }
        index(i);
        return current.getNext();
    }

    // 是否是空链表
    public boolean isEmpty() throws Exception{
        return size==0?true:false;
    }
}
