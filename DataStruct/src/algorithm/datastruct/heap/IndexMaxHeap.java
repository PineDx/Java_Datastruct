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

    /**
     * 初始化堆
     * @param capacity 容量大小
     */
    public IndexMaxHeap(int capacity){
        if (capacity > 0) {
            arr = new int[capacity];
            indexArr = new int[capacity];
            this.capacity = capacity;
            count = 0;
        }
    }

    /**
     * 向堆中插入元素
     * @param index 索引数组下标
     * @param k 元素
     */
    public void insert(int index, int k) {
        assert count + 1 <= capacity : "容量超过最大值";
        assert index >= 0 && index + 1 <= capacity : "索引值异常";

        // 堆的数据项
        arr[index] = k;
        // 堆的索引项
        indexArr[index] = index;
        shiftUp(count);
        count++;

    }

    /**
     * shiftup 的过程
     * @param k
     */
    private void shiftUp(int k) {
        int temp;
        while ( k >= 0 && arr[indexArr[k/2]] < arr[indexArr[k]]) {
            temp = indexArr[k/2];
            indexArr[k/2] = indexArr[k];
            indexArr[k] = temp;
            k /= 2;
        }
    }

    /**
     * 获取最大堆的顶上元素
     * @return
     */
    public int extractMax() {

        int ret = arr[indexArr[0]];
        int temp = indexArr[0];
        indexArr[0] = indexArr[count-1];
        indexArr[count-1] = temp;
        count--;

        shiftDwon(0);
        return ret;
    }

    /**
     * 获取最大堆的顶上元素索引 可直接通过get找到该元素
     * @return
     */
    public int extractMaxIndex() {
        assert count  > 0;
        int ret = arr[indexArr[0]];
        int temp = indexArr[0];
        indexArr[0] = indexArr[count];
        indexArr[count] = temp;
        count--;

        shiftDwon(0);
        return ret;
    }

    /**
     * shiftdown 的过程
     * @param k 代表元素在索引中的下标
     */
    private void shiftDwon(int k) {

        while ( 2*k <= count-1 ) {
            int j = 2*k + 1;
            if ( j + 1 <= count-1 && arr[indexArr[j + 1]] > arr[indexArr[j]]) {
                j += 1;
            }
            if (arr[indexArr[k]] > arr[indexArr[j]]) break;
            int temp = indexArr[k];
            indexArr[k] = indexArr[j];
            indexArr[j] = temp;
            k = j;
        }
    }

    /**
     * 堆的最大元素
     * @return
     */
    public int size() {
        return count;
    }

    /**
     * 堆是否为空
     * @return
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 打印堆中元素
     */
    public void ScanHeap() {
        for (int i :
                indexArr) {
            System.out.print(arr[i]  + " ");
        }
    }

    /**
     * 通过下标直接获取元素
     * @param i
     * @return
     */
    public int getItem( int i ) {
        return arr[i];
    }

    /**
     * 改变该元素的值 重新构建最大堆性质
     * @param i
     * @param item
     */
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
