package algorithm.design.creation.SingletonPattern.lazy;


/**
 * Title: 懒汉式单例
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/22-0:07
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazysingleton = null;

    /**
     * 构造方法私有化
     */
    private LazySimpleSingleton(){}


    /**
     * 提供一个全局访问点
     */
    public synchronized static LazySimpleSingleton getInstance() {
        if ( lazysingleton == null ) {
            lazysingleton = new LazySimpleSingleton();
        }
        return lazysingleton;
    }
}
