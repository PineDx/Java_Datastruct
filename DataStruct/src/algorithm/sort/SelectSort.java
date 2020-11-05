package algorithm.sort;

/**
 * <选择排序>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/5-15:24
 */
public class SelectSort {
    public int[] sort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            // 选择当前项为最小值 记录最小值下标
            int minIndex = i;
            // 得到整组数列中最小值下标
            for (int j = i + 1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    // 发现更小值
                    minIndex = j;
                }
            }

            // 交换两数位置
            if (i != minIndex){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
