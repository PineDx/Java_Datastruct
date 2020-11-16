package Test.algorithm;

import algorithm.algorithm.StringMatch;

import java.util.Scanner;

/**
 * <字符串匹配测试>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/15-17:03
 */
public class StringMatchTest {
    public static void main(String[] args) throws Exception {
        String a;
        String b;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入主串--输入0退出");
            a = scan.nextLine();
            if (a.charAt(0) == '0'){
                break;
            }
            System.out.println("请输入要匹配的子串");
            b = scan.nextLine();
//            System.out.println("结果为:"+StringMatch.BFmatch(a.toCharArray(), b.toCharArray()));
            System.out.println("位置:"+StringMatch.KMPmatch(a.toCharArray(), b.toCharArray()));
        }

    }
}
