package algorithm.sort;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/19-22:22
 */
public class QuickSort {
    public static final int NORMAL = 1;
    public static final int ORDER = 2;
    public static final int REPERT = 3;
    public static final int WAYSTHREE = 4;
    public int[] sort(int [] array, int model){
        switch (model){
            case NORMAL:
                quicksort(array , 0 , array.length - 1);
                break;
            case ORDER:
            case REPERT:
                quicksortOrder(array, 0 ,array.length - 1);
                break;
            case WAYSTHREE:
                quicksortWays(array, 0 , array.length - 1);
                break;
        }
        return array;
    }

    // 正常排序
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

    // 优化方式2 大量重复的键值
    private void quicksortOrder(int [] arr, int l , int r) {
        if (l >= r) {
            return;
        }
        int p = partitionOrder(arr, l , r);
        quicksortOrder(arr , l , p - 1);
        quicksortOrder(arr , p + 1 , r);
    }
    private int partitionOrder(int[] arr, int l, int r) {
        int temp;
        // 在执行近乎有序的序列中，退化成O(N^2)
        // 优化方法
        int t = (int) (Math.random()*(r-l)+l);
        // 随机交换 防止退化成线性树
        temp = arr[t];
        arr[t] = arr[l];
        arr[l] = temp;

        int v = arr[l];
        int i = l + 1,j = r;

        while (true) {
            while ( i <= r && arr[i] < v ) i++;
            while ( j >= l+1 && arr[j] > v ) j--;
            if ( i > j ) break;
            // 交换两数的值
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }

    // 三路快速排序
    private void quicksortWays(int[] arr, int l , int r) {
        if ( l >= r) {
            return;
        }
        int v = arr[l];
        int lt = l;
        int gt = r + 1;
        int i = l + 1;
        int temp;
        while ( i < gt ) {
            if (arr[i] < v) {
                temp = arr[i];
                arr[i] = arr[lt + 1];
                arr[lt + 1] = temp;
                lt++;
                i ++;
            }
            else if (arr[i] > v) {
                temp = arr[i];
                arr[i] = arr[gt - 1];
                arr[gt -1] = temp;
                gt--;
            }
            else {
                i++;
            }
        }
        temp = arr[l];
        arr[l] = arr[lt];
        arr[lt] = temp;
        quicksortWays(arr, l, lt-1);
        quicksortWays(arr, gt, r);
    }
}
