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

    public SortTool() {
        this.custome_size = 10;
    }
    public SortTool(int size){
        this.custome_size = size;
    }

    public int[] getArrayInt(){
        int[] arr = new int[custome_size];
        for (int i = 0; i < custome_size; i++) {
            arr[i] = (int)(Math.random()*100);
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
