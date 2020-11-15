package Test.datastruct;

import algorithm.datastruct.linkedStack.LinkedStack;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/10-15:33
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack lstack = new LinkedStack();

        lstack.push("songlin");
        lstack.push("qianyu");
        lstack.push("spacecoder");
        System.out.println(lstack.getSize());
        System.out.println(lstack.pop());
        System.out.println(lstack.pop());
        System.out.println(lstack.getSize());
        System.out.println(lstack.pop());
//        System.out.println(lstack.pop());
        System.out.println(lstack.getSize());
        lstack.push("songlin");
        lstack.push("qianyu");
        lstack.push("spacecoder");
        lstack.setEmpty();
        System.out.println(lstack.isEmpty());
    }
}
