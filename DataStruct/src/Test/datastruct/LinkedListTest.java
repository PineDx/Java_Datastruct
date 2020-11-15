package Test.datastruct;

import algorithm.datastruct.linkedList.CyclicLinkedList;
import algorithm.datastruct.linkedList.Node;

/**
 * <单链表测试类>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/4-21:30
 */
public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        // 初始化链表 单向链表
//        LinkedList list = new LinkedList();
//        list.add(new Node(1));
//        list.add(new Node(2));
//        list.add(new Node(3));
//
//        list.insert(1,4);
//        list.insert(3,5);
//        list.ShowList();
//        list.delete(1);
//        list.delete(1);
//        list.ShowList();
//        Node n = list.getNode(2);
//        System.out.println(n.getElement());


        //循环单链表
        CyclicLinkedList cyclist = new CyclicLinkedList();
        cyclist.add(new Node(1));
        cyclist.add(new Node(2));
        cyclist.insert(1,4);
        cyclist.insert(3,5);
        cyclist.ShowList();
        cyclist.delete(1);
        cyclist.delete(1);
        cyclist.ShowList();
        Node n = cyclist.getNode(2);
        System.out.println(n.getElement());

    }
}
