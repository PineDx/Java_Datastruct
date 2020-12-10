package Test.datastruct.sort;

import algorithm.sort.*;
import algorithm.tool.SortTool;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/5-15:29
 */
public class SortTest {
    public static void main(String[] args) {


            SortTool sortTool = new SortTool(10, 0 ,100);
            int[] arr = sortTool.getArrayInt();
            System.out.print("排序前:");
            sortTool.ScanArr(arr);
            // 冒泡排序
//            BubbleSort sort = new BubbleSort();
            // 选择排序
//            SelectSort sort = new SelectSort();
            // 插入排序
//            InsertionSort sort = new InsertionSort();
            // 归并排序
//            MergeSort sort = new MergeSort();
//            arr = sort.sort(arr);
            // 快速排序
//            QuickSort sort = new QuickSort();
//            arr = sort.sort(arr, QuickSort.WAYSTHREE);
            // 堆排序
            HeapSort sort = new HeapSort();
            arr = sort.sort(arr, HeapSort.STAND);

        System.out.print("排序后:");
            sortTool.ScanArr(arr);
    }
}
