package Test;

import algorithm.sort.BubbleSort;
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


            SortTool sortTool = new SortTool(20);
            int[] arr = sortTool.getArrayInt();
            System.out.print("排序前:");
            sortTool.ScanArr(arr);

//            BubbleSort sort = new BubbleSort();
            SelectSort sort = new SelectSort();
            arr = sort.sort(arr);
            System.out.print("排序后:");
            sortTool.ScanArr(arr);
    }
}
