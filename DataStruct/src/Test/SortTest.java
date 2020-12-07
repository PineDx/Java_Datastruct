package Test;

import algorithm.sort.BubbleSort;
import algorithm.sort.InsertionSort;
import algorithm.sort.SelectSort;
import algorithm.tool.SortTool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;

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
            InsertionSort sort = new InsertionSort();
            arr = sort.sort(arr);

            System.out.print("排序后:");
            sortTool.ScanArr(arr);
    }
}
