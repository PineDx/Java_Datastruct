package algorithm.tool;

import java.lang.reflect.Array;

/**
 * <功能简述>
 * <功能详细描述>
 *
 * @Author: Songlin
 * @create: 2020/11/5-14:04
 */
public class SortTool {

    private int custome_size;   // 用户指定大小
    private int rangeL;
    private int rangeR;

    public SortTool() {
        this.custome_size = 10;
        this.rangeL = 0;
        this.rangeR = 1000;
    }
    public SortTool(int size){
        this.custome_size = size;
        this.rangeL = 0;
        this.rangeR = 1000;
    }
    public SortTool(int size, int l ,int r) {
        this.custome_size = size;
        r = l < r ? r : (l + r);
        this.rangeL = l;
        this.rangeR = r;
    }

    public int[] getArrayInt(){
        int[] arr = new int[custome_size];
        for (int i = 0; i < custome_size; i++) {
            arr[i] = (int)(Math.random() * (this.rangeR - this.rangeL + 1));
        }
        return arr;
    }

    public void ScanArr(int[] arr){
        for (int i :arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }
    public static void main(String[] args) {
        SortTool sortTool = new SortTool(15);
        int[] arr = sortTool.getArrayInt();
        for (int a :
                arr) {
            System.out.print(a+" ");
        }
    }
}
