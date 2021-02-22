package algorithm.design.creation.SingletonPattern.lazy;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/22-0:17
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile 关键子解决重排序问题
     */

    private volatile static LazyDoubleCheckSingleton lazysingleton = null;

    /**
     * 构造方法私有化
     */
    private LazyDoubleCheckSingleton(){}


    /**
     * 提供一个全局访问点
     */
    public  static LazyDoubleCheckSingleton getInstance() {
        if ( lazysingleton == null ) {
            /**
             * 双重锁
             */
            synchronized (LazySimpleSingleton.class) {
                if ( lazysingleton == null ){
                    lazysingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazysingleton;
    }
}
