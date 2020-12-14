package Test.datastruct.tree;

import algorithm.datastruct.heap.IndexMaxHeap;
import algorithm.datastruct.heap.MaxHeap;
import algorithm.tool.SortTool;

/**
 * Title: 最大堆的测试
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/9-11:00
 */
public class MaxHeapTest {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        SortTool sortTool = new SortTool(10, 0 ,100);
        int[] arr = sortTool.getArrayInt();
        System.out.print("原数组:\t");
        sortTool.ScanArr(arr);
        for (int value : arr) {
            heap.insert(value);
        }
        System.out.print("最大堆:\t");
        heap.ScanHeap();
        System.out.print("\n最大堆排序:\t");
        while (!heap.isEmpty()) {
            System.out.print(heap.extractMax() + " ");
        }

        // 索引最大堆实现
        IndexMaxHeap indexheap = new IndexMaxHeap(10);

        for (int i = 0; i < arr.length ; i++ ) {
            indexheap.insert(i, arr[i]);
        }

        System.out.print("\n索引最大堆的实现:\t");
        indexheap.ScanHeap();
        System.out.print("\n排好序的索引最大堆的实现:\t");
        while (!indexheap.isEmpty()) {
            System.out.print(indexheap.extractMax() + " ");
        }
    }
}
