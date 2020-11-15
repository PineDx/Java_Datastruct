package Test.datastruct;

import algorithm.datastruct.StaticStr;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/14-20:18
 */
public class StaticStrTest {
    public static void main(String[] args) {
        String str = "songlin is a good boy!";
        char[] strs = str.toCharArray();

        StaticStr ss = new StaticStr(strs);
        System.out.println("字符串长度"+ss.length());
        StaticStr staticStr = ss.subString(0, 7);
        System.out.println(staticStr);

        char[] read = StaticStr.read();
        System.out.println(new String(read));
    }
}
