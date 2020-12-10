package algorithm.sort;

import algorithm.datastruct.heap.MaxHeap;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/9-14:12
 */
public class HeapSort {
    public static final int NORMAL = 1;
    public static final int ORDER = 2;
    public static final int REPERT = 3;
    public static final int WAYSTHREE = 4;

    public int[] sort(int[] arr, int model) {

        switch (model){
            case NORMAL:
                heapSort(arr);
                break;
//            case ORDER:
//            case REPERT:
//                quicksortOrder(array, 0 ,array.length - 1);
//                break;
//            case WAYSTHREE:
//                quicksortWays(array, 0 , array.length - 1);
//                break;
        }
        return arr;
    }

    private void heapSort(int[] arr) {
        MaxHeap heap = new MaxHeap(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.extractMax();
        }
    }
}
