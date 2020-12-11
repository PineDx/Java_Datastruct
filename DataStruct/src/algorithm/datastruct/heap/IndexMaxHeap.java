package algorithm.datastruct.heap;

/**
 * Title:索引最大堆
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/11-15:46
 */
public class IndexMaxHeap {
    /**
     * arr : 堆的线性数组
     * indexArr : 索引堆
     * capacity : 堆的容量
     * count : 堆的计数
     */
    private int[] arr;
    private int[] indexArr;
    private int capacity;
    private int count;

    public IndexMaxHeap(int capacity){
        if (capacity > 0) {
            arr = new int[capacity];
            indexArr = new int[capacity];
            this.capacity = capacity;
            count = 0;
        }
    }

    public void insert(int index, int k) {
        assert count + 1 <= capacity : "容量超过最大值";
        assert index >= 0 && index + 1 <= capacity : "索引值异常";

        // 堆的数据项
        arr[index] = k;
        // 堆的索引项
        indexArr[count++] = index;
        shiftUp(count);

    }

    private void shiftUp(int k) {
        int temp;
        while ( k >= 0 && arr[indexArr[k/2]] < arr[indexArr[k]]) {
            temp = indexArr[k/2];
            indexArr[k/2] = indexArr[k];
            indexArr[k] = temp;
            k /= 2;
        }
    }

    public int extractMax() {
        assert count  > 0;
        int ret = arr[indexArr[0]];
        int temp = indexArr[0];
        indexArr[0] = indexArr[count];
        indexArr[count] = temp;
        count--;

        shiftDwon(0);
        return ret;
    }

    private void shiftDwon(int k) {

        while ( 2*k <= count ) {
            int j = 2*k + 1;
            if ( j + 1 <= count && arr[indexArr[j + 1]] > arr[indexArr[j]]) {
                j += 1;
            }
            if (arr[indexArr[k]] > arr[indexArr[j]]) break;
            int temp = indexArr[k];
            indexArr[k] = indexArr[j];
            indexArr[j] = temp;
            k = j;
        }
    }
    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getItem( int i ) {
        return arr[i];
    }

    public void change( int i , int item) {
        arr[i] = item;

        for (int j = 0; j <= count ; j++ ) {
            if (indexArr[j] == i) {
                shiftUp(j);
                shiftDwon(j);
                return;
            }
        }

    }
}
