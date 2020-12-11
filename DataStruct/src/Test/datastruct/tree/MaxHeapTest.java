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
        System.out.println("原数组:");
        sortTool.ScanArr(arr);
        for (int value : arr) {
            heap.insert(value);
        }
        System.out.println("最大堆:");
        heap.ScanHeap();
        System.out.println("\n");
        while (!heap.isEmpty()) {
            System.out.print(heap.extractMax() + " ");
        }

        IndexMaxHeap indexheap = new IndexMaxHeap(10);

        for (int i = 0; i < arr.length ; i++ ) {
            indexheap.insert(i, arr[i]);
        }

        System.out.println("索引最大堆的实现:");
        while (!indexheap.isEmpty()) {
            System.out.print(indexheap.extractMax() + " ");
        }
    }
}
