package algorithm.datastruct;
/**
 * <自定义顺序表>
 * <顺序表的基本运算实现>
 * @Author: Songlin
 * @create: 2020/11/3-20:39
 */
public class SeqList{
    private final int defaultSize = 10;
    private int maxSize;
    public int size;
    private Object[] listArray;

    /**
     * 无参构造函数，初始化默认顺序表大小
     */
    public SeqList(){
        init(defaultSize);
    }

    /**
     * 有参构造器，初始化默认顺序大小为用户指定
     * @param size
     */
    public SeqList(int size){
        init(size);
    }

    /**
     * 初始化顺序表
     * @param size
     */
    private void init(int size){
        this.maxSize = size;
        this.size = 0;
        listArray = new Object[size];
    }

    /**
     * 在指定位置插入元素
     * @param i 位置
     * @param obj   元素
     * @throws Exception
     */
    public void insert(int i,Object obj) throws Exception{
        if (size == maxSize){
            throw new Exception("顺序表已满无法插入");
        }
        if (i < 0 || i > size){
            throw new Exception("参数错误,插入位置不合法");
        }
        // 移动顺序表元素
        for (int j = size; j >= i ; j--) {
            listArray[j] = listArray[j-1];
        }
        listArray[i-1] = obj;
        size++;
    }

    /**
     * 删除指定位置的元素
     * @param i 位置
     * @return 所删除元素
     * @throws Exception
     */
    public Object delete(int i) throws Exception{
        if (isLocERROR(i)){
            throw new Exception("参数错误,删除位置不合法");
        }
        if (isEmpty()){
            throw new Exception("顺序表已空无法删除");
        }
        Object del = listArray[i-1];
        // 移动顺序表元素
        for (int j = i-1 ;j < size ;j ++){
                listArray[j] = listArray[j+1];
        }
        size--;
        return del;
    }

    /**
     * 删除顺序表开头元素
     * @return 删除元素
     * @throws Exception
     */
    public Object deleteLast() throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空无法删除");
        }
        Object obj = listArray[size-1];
        size--;
        return obj;
    }

    /**
     * 删除顺序表结尾元素
     * @return
     * @throws Exception
     */
    public Object deleteFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空无法删除");
        }
        Object obj = listArray[0];
        for (int i = 0; i < size ;i++){
            listArray[i] = listArray[i+1];
        }
        size--;
        return obj;
    }
    /**
     * 获取指定位置的元素
     * @param i 位置
     * @return 获取的元素
     * @throws Exception
     */
    public Object get(int i) throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空获取失败");
        }
        if (isLocERROR(i)){
            throw new Exception("参数错误,位置不合法");
        }
        return listArray[i-1];
    }

    /**
     * 获取第一个元素
     * @return
     * @throws Exception
     */
    public Object getFirst() throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空获取失败");
        }
        return listArray[0];
    }

    /**
     * 获取最后一个元素
     * @return
     * @throws Exception
     */
    public Object getLast() throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空获取失败");
        }
        return listArray[size-1];
    }
    /**
     * 修改指定位置的元素
     * @param i
     * @param obj
     * @throws Exception
     */
    public void set(int i, Object obj) throws Exception{
        if (isEmpty()){
            throw new Exception("顺序表已空修改失败");
        }
        if (isLocERROR(i)){
            throw new Exception("参数错误,位置不合法");
        }
        listArray[i-1] = obj;
    }
    /**
     * 在顺序表中添加元素
     * @param obj 元素
     * @throws Exception
     */
    public void add(Object obj) throws Exception{
        if (isFull()){
            throw new Exception("顺序表已满无法插入元素");
        }
        listArray[size++] = obj;
    }

    /**
     * 在顺序表开头添加元素
     * @param obj 元素
     * @throws Exception
     */
    public void addFirst(Object obj) throws Exception{
        if (isFull()){
            throw new Exception("顺序表已满无法插入元素");
        }
        for (int i = size; i > 0; i--){
            listArray[i] = listArray[i-1];
        }
        listArray[0] = obj;
        size++;
    }

    /**
     * 在顺序表末尾添加元素
     * @param obj 元素
     * @throws Exception
     */
    public void addLast(Object obj) throws Exception{
        if (isFull()){
            throw new Exception("顺序表已满无法插入元素");
        }
        listArray[size++] = obj;
    }
    /**
     * 顺序表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 顺序表是否溢出
     * @return
     */
    public boolean isFull(){
        return size == maxSize;
    }

    /**
     * 位置参数是否错误
     * @param i
     * @return
     */
    public boolean isLocERROR(int i){
        return i < 0 || i > size - 1;
    }

    public void clear(){
        size = 0;
    }

    public void fore(){
        int i = 0;
        for (Object v : listArray) {
            if (++i > size) break;
            System.out.println(i+"-->"+v);

        }
    }
}
