package algorithm.algorithm;

import java.util.Arrays;

/**
 * Title: 八皇后问题
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/14-20:27
 */
public class EightQueens {
    // 多少结果集
    static int all = 0;
    // 行
    boolean row[] = new boolean[8];
    // 列
    boolean col[] = new boolean[8];
    // 左斜
    boolean lef[] = new boolean[15];
    // 右斜
    boolean rig[] = new boolean[15];
    // map地图
    int map[][] = new int[8][8];

    public void start() {
        dfs(0, row, col, lef, rig, map);
    }

    private  void dfs(int index, boolean[] row, boolean[] col, boolean[] lef, boolean[] rig, int[][] map) {
        if (index == 8) {
            all++;
            printmap(map);
        } else {
            for (int i = 0; i < 8 ; i++ ) {
                if (!row[index] && !col[index] && !lef[index+i] && !rig[index + (7 - i)]) {

                    row[index] = true;
                    col[i] = true;
                    lef[index + i] = true;
                    lef[index + (7 - i)] = true;
                    map[index][i] = 1;

                    dfs(index + 1, row, col, lef, rig, map);

                    row[index] = false;
                    col[i] = false;
                    lef[index + i] = false;
                    lef[index + (7 - i)] = false;
                    map[index][i] = 0;
                }
            }
        }
    }


    private void printmap(int[][] map) {
        System.out.println("第" + all + "个排列为:");
        for (int i[] : map) {
            System.out.println(Arrays.toString(i));
        }
    }
}
