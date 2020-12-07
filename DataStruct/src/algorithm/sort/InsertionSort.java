package algorithm.sort;

/**
 * Title:插入排序
 * Desc:对近乎有序的序列，速度更快
 *
 * @Author: Songlin
 * @create: 2020/12/7-11:18
 */
public class InsertionSort {

    public int[] sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            // 寻找元素arr[i] 合适的插入位置
            for (int j = i; j > 0 && (arr[j] < arr[j-1]); j--) {
                // 比较前一个值 三次加减法交换
                arr[j] = arr[j] + arr[j-1];
                arr[j-1] = arr[j] - arr[j-1];
                arr[j] = arr[j] - arr[j-1];
            }
        }
        return arr;
    }

    // 插入排序优化1
    public int[] sort_1(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            // arr[i] 应该插入的位置
            int e = arr[i];
            int j;
            // 寻找元素arr[i] 合适的插入位置
            for (j = i; j > 0 && (arr[j-1] > e); j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
        return arr;
    }
}
