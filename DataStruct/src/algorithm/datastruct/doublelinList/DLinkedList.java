package algorithm.datastruct.doublelinList;

import algorithm.datastruct.linkedList.Node;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/6-15:52
 */
public class DLinkedList {
    /**
     * 头结点
     */
    public DNode head;
    /**
     * 当前结点
      */
    public DNode current;
    /**
     * 双向链表大小
      */
    private int size;

    public DLinkedList(){
        head = current = new DNode();
        head.setPrior(null);
        head.setNext(null);
        this.size = 0;
    }
    public DLinkedList(DNode head){
        this.head = current = head;
        this.head.setPrior(null);
        this.head.setNext(null);
        this.size = 0;
    }
    private void index(int i){
        current = head;
        int j = 0;
        while (current.getNext()!=null && j < i-1){
            current = current.getNext();
            j++;
        }
    }

    /**
     * 往双向链表中添加新结点
     * @param node
     */
    public void add(DNode node){
        while(this.current.getNext() != null){
            // 向后移动
            this.current = this.current.getNext();
        }
        this.current.setNext(node);
        // 将新结点指向空
        node.setNext(null);
        // 将新结点指向前
        node.setPrior(this.current);
        this.size++;
    }

    public void insert(int i , Object ele) throws Exception {
        if (i < 0 && i > size){
            throw new Exception("参数错误");
        }
        index(i);
        DNode n = new DNode(ele);
        // 临时指针指向的结点 修改它的前驱
        current.getNext().setPrior(n);
        // 新结点指向临时指针的下一个
        n.setNext(current.getNext());
        // 临时结点的后继指向新结点
        this.current.setNext(n);
        // 新结点的前驱指向临时结点
        n.setPrior(current);
        this.size++;
    }

    public Object delete(int i) throws Exception{
        if (i < 0 && i > size){
            throw new Exception("参数错误");
        }
        index(i);
        Object obj = current.getNext().getElement();
        current.setNext(current.getNext().getNext());
        current.getNext().getNext().setPrior(current);
        size--;
        return obj;
    }

    public void ShowList(){
        DNode p = head;
        while(p.getNext() != null){
            p = p.getNext();
            System.out.println(p.getElement());
        }
        System.out.println("单链表大小"+this.size);
    }

}
