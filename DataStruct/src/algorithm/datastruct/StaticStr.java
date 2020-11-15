package algorithm.datastruct;

import java.io.IOException;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/14-19:53
 */
public class StaticStr {
    // 字符数组
    private char[] chars;
    // 字符串长度
    private int length;

    public StaticStr(char[] chars){
        this.chars = chars;
        this.length = chars.length;
    }

    /**
     * 返回一个新的字串，它是此字符串的一个子字符串
     * @param beginIndex 指定开始的位置
     * @param endIndex  指定结束的位置
     * @return 新的字符串
     */
    public StaticStr subString(int beginIndex, int endIndex){
        // 子字符串的长度
        int len = endIndex - beginIndex;
        // beginIndex不能小于0 ，endIndex 不能大于length-1, 子字符串的长度要大于0
        if (beginIndex < 0 || endIndex > length-1 || len < 1){
            System.out.println("subString 参数错误!");
            return null;
        }
        char[] subs = new char[len];
        int j = 0;
        for (int i = beginIndex; i < endIndex; i++){
            subs[j] = chars[i];
            j++;
        }
        StaticStr str = new StaticStr(subs);
        return str;
    }

    /**
     * 返回字符串长度
     * @return int 长度
     */
    public int length(){
        return length;
    }

    /**
     * 读取用户的输入，返回字符数组
     * @return
     */
    public static char[] read(){
        int maxsize = 20;
        byte[] bs = new byte[maxsize];
        System.out.println("请输入字符串");
        try {
            System.in.read(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] cs = new char[maxsize];
        int len = 0;
        for (int i = 0; i < maxsize; i++){
            byte e = bs[i];
            // 如果字符为回车符，则表示字符输入结束
            if (e == 13){
                break;
            }
            cs[i] = (char) e;
            len = i+1;
        }
        char[] str = new char[len];
        for (int j = 0; j < len; j++){
            str[j] = cs[j];
        }
        return str;
    }

    @Override
    public String toString(){
        return new String(chars);
    }
}
