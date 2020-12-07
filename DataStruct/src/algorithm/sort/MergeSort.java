package algorithm.sort;

/**
 * Title:归并排序
 * Desc:递归和迭代完成归并排序
 *
 * @Author: Songlin
 * @create: 2020/12/7-15:21
 */
public class MergeSort {

    public int[] sort(int[] arr) {
        __mergeSort(arr, 0 , arr.length-1);
        return arr;
    }

    private void __mergeSort(int[] arr, int l, int r) {
        // 递归出口
        if ( l >= r ) {
            return;
        }
        int mid = (l + r) / 2;
        // 左段递归
        __mergeSort(arr, l, mid);
        // 右段递归
        __mergeSort(arr, mid+1, r);
        // 归并操作
//        __merge(arr, l, mid, r);
        // 优化方案
        if (arr[mid] > arr[mid+1]){
            __merge(arr, l , mid, r);
        }
    }

    private void __merge(int[] arr,int l,int mid, int r) {
        // 辅助空间
        int[] aux = new int[r-l+1];
        // 将数据项复制到辅助空间
        for ( int i = l; i <= r ; i++ ) {
            aux[i-l] = arr[i];
        }
        int subl = l, subr = mid + 1;
        for ( int k = l; k <= r ; k++) {
            if ( subl > mid ){
                arr[k] = aux[subr - l];
                subr++;
            } else if (subr > r ) {
                arr[k] = aux[subl - l];
                subl++;
            }else  if (aux[subl - l] < aux[subr - l]) {
                arr[k] = aux[subl - l];
                subl++;
            } else {
                arr[k] = aux[subr - l];
                subr++;
            }
        }

    }
    //_____________________迭代
    public int[] sortBU(int[] arr){
        for (int sz = 1 ; sz <= arr.length; sz += sz)
            for (int i = 0; i + sz < arr.length; i += sz + sz)
                __merge(arr , i, i + sz -1, Math.min(i + sz + sz - 1, arr.length - 1));

        return arr;
    }
}
