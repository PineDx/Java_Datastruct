package Test.datastruct.array;

import algorithm.datastruct.SeqList;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/3-21:33
 */
public class SeqListTest {

    public static void main(String[] args) throws Exception {
        SeqList sq = new SeqList();

        sq.add("xurenze");
        sq.add("ipioio");
        sq.add("niio");
        sq.addLast("lopppp");
        sq.addFirst("first1");
        sq.fore();
        sq.insert(3, "disan");
//        sq.deleteFirst();
//        System.out.println(sq.deleteLast());
//        System.out.println(sq.delete(3));
//        System.out.println(sq.delete(4));
//        System.out.println(sq.getLast());
        System.out.println(sq.get(3));
        sq.fore();
        System.out.println(sq.size);
    }

}
