package algorithm.algorithm;

/**
 * <字符串匹配算法>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/15-16:42
 */
public class StringMatch {
    /**
     * 字符串 BF匹配算法
     * @param A 字符数组
     * @param B 字符数组
     * @return 结果
     * @throws Exception
     */
    public static boolean BFmatch(char[] A , char[] B) throws Exception {
        int Alength = A.length;
        int Blength = B.length;
        if (Alength < Blength){
            throw new Exception("主串长度要大于子串!");
        }
        int i = 0,j = 0;
        while (i < Alength && j < Blength) {
                if ( A[i] == B[j]) {
                    i++;
                    j++;
                } else {
                    i = i - j + 1;
                    j = 0;
                }
        }
        if (j == Blength){
            return true;
            // return i - Alength + 1 返回匹配次数
        }
        return false;
    }

    public static int KMPmatch(char[] T , char[] P){
        int[] next = new int[T.length];
        Next(T, next);
        System.out.print("Next数组值:");
        for (int i : next) {
            System.out.print(i+"\t");
        }
        System.out.println("\n");

        int i = 0,j = 0;
        while (i < T.length && j < P.length){
            if (j == -1 || T[i] == P[j]){
                j++;
                i++;
            }else{
                j = next[j];
            }
        }
        if (j == P.length){
            return i - P.length;
        }else{
            return -1;
        }
    }
    /**
     * prefix Table
     * @param P
     * @param next
     */
    private static void Next(char[] P, int[] next) {
        next[0] = -1;
        int i = 0;
        int len = -1; // 最长公共前后缀长度
        while (i < P.length -1) {
            if (len == -1 || P[i] == P[len]){
                i++;
                len++;
                next[i] = len;
            }else {
                len = next[len];
            }
        }
    }
}
