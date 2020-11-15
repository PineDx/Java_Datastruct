package algorithm.sort;

import algorithm.tool.SortTool;

import java.util.Objects;

/**
 * <冒泡排序>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/5-14:03
 */
public class BubbleSort {

    public int[] sort(int [] array){
        int temp = 0; // 临时变量
        for (int i = 0; i < array.length -1 ; i++){
            int flag = 0;  // 状态位
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j+1] < array[j]){ // 小于从小到大
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)break;
        }
        return array;
    }
}
