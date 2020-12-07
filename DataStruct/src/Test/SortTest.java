package Test;

import algorithm.sort.BubbleSort;
import algorithm.sort.InsertionSort;
import algorithm.sort.MergeSort;
import algorithm.sort.SelectSort;
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


            SortTool sortTool = new SortTool(15, 0 ,1000);
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
            MergeSort sort = new MergeSort();
//            arr = sort.sort(arr);
            arr = sort.sortBU(arr);

            System.out.print("排序后:");
            sortTool.ScanArr(arr);
    }
}
