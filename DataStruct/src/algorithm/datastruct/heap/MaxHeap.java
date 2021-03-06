package algorithm.datastruct.heap;

import algorithm.tool.SortTool;

/**
 * Title: 最大堆
 * Desc: 用线性数组表示堆
 *
 * @Author: Songlin
 * @create: 2020/12/9-10:25
 */
public class MaxHeap {
    private int[] arr;
    private int count;
    private int cap;

    public MaxHeap() {

    }
    public MaxHeap(int capacity) {
        if (capacity > 0) {
            arr = new int[capacity+1];
            cap = capacity;
        }else {
            arr = null;
        }
        count = 0;
    }
    // 优化堆方法1
    // 两次shiftdown操作
    public MaxHeap(int[] array, int capacity) {
        if (capacity > 0) {
            arr = new int[capacity+1];
            cap = capacity;
        }else {
            arr = null;
        }
        for (int i = 0; i < capacity; i++)
            arr[i+1] = array[i];

        count = capacity;
        // 对第一个不是叶子节点的节点进行shiftDown操作
        for (int i = count/2 ; i >= 1; i--) {
            shiftDown(i);
        }
    }
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(int item) {
        assert count + 1 <= cap : "容量超过最大值";
        // 容量不够时，开辟新的空间
        //~~~~~pre
        arr[++count] = item;
        // 将元素转置合适的位置
        shiftUp(count);
    }

    public int extractMax() {
        assert count > 0 : "堆为空";
        int ret = arr[1];
        // 直接赋破坏了堆的完整性，不可二次利用
//        arr[1] = arr[count];
        // 交换不破坏堆的数据完整性
        int temp = arr[1];
        arr[1] = arr[count];
        arr[count] = temp;
        count--;
        if (count == 0) return ret;
        shiftDown(1);
        return ret;
    }
    private void shiftUp(int k) {
        int temp;
        while ( k > 1 && arr[k/2] < arr[k] ) {
            temp = arr[k/2];
            arr[k/2] = arr[k];
            arr[k] = temp;
            k /= 2;
        }
    }

    private void shiftDown(int k) {
        int temp;
        while ( 2*k <= count ) {
            int j = 2*k;
            if ( j + 1 <= count && arr[j + 1] > arr[j]) {
                j += 1;
            }
            if ( arr[k] >= arr[j]) break;
            temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k = j;
        }
    }

    // 原地堆排序 heapify 操作
    public void heapSortStand(int[] arr, int n) {
        // heapify
        for ( int i = (n-1)/2 ; i >= 0 ; i--){
            standShiftDown(arr, n , i );
        }
        // heapify之后数组第一个值就是最大的，从倒数第二个值开始shiftdown
        for ( int i = n-1 ; i > 0; i-- ){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            standShiftDown(arr, i , 0);
        }

    }
    // 原地堆 shiftDown
    private void standShiftDown(int[] arr, int n , int k) {
        int temp;
        while ( 2*k+1 < n) {
            int j = 2*k + 1;
            if ( j + 1 < n && arr[j+1] > arr[j]) {
                j += 1;
            }
            if (arr[k] >= arr[j]) break;
            temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k = j;
        }
    }
    public void ScanHeap() {
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }

    public int[] getArr() {
        return this.arr;
    }
}
