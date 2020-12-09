package Test.datastruct.array;

import algorithm.datastruct.SeqStack;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/10-14:37
 */
public class SeqStackTest {
    public static void main(String[] args) {
        SeqStack stack = new SeqStack(5);
        stack.push("xurenze");
        stack.push("songlin");
        stack.push("coder");
        stack.push("qwed");
        stack.push("coddsaer");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("1111");
        stack.push("2222");
        stack.push("3333");
        stack.showStack();
        System.out.println(stack.getTop());
        System.out.println(stack.getSize());


    }
}
