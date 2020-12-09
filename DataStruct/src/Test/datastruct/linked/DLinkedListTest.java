package Test.datastruct.linked;

import algorithm.datastruct.doublelinList.DLinkedList;
import algorithm.datastruct.doublelinList.DNode;
import algorithm.datastruct.linkedList.Node;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/6-16:53
 */
public class DLinkedListTest {
    public static void main(String[] args) throws Exception {
        DLinkedList dualist = new DLinkedList();

        DNode a1 = new DNode("1");
        DNode a2 = new DNode("2");
        DNode a3 = new DNode("3");
        DNode a4 = new DNode("4");
        dualist.add(a1);
        dualist.add(a2);
        dualist.add(a3);
        dualist.add(a4);
        dualist.ShowList();
        dualist.insert(1, 5);
        dualist.insert(3, 6);
        dualist.delete(1);
        dualist.ShowList();
        System.out.println(dualist.delete(1));
        dualist.ShowList();
    }
}
