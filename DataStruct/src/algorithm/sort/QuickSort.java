package algorithm.sort;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/19-22:22
 */
public class QuickSort {
    public int[] sort(int [] array){
        quicksort(array , 0 , array.length - 1);
        return array;
    }

    private void quicksort(int [] arr, int l , int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l , r);
        quicksort(arr , l , p - 1);
        quicksort(arr , p + 1 , r);
    }

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        int temp;
        for (int i = l+1; i <= r ; i++) {
            if ( arr[i] < v ) {
                temp = arr[i];
                arr[i] = arr[j+1];
                arr[j+1] = temp;
                j++;
            }
        }
        // 交换p 值
        temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
