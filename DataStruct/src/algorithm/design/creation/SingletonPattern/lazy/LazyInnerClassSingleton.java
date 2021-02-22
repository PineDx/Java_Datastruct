package algorithm.design.creation.SingletonPattern.lazy;

/**
 * Title: 静态内部类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/22-11:22
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.lazy;
    }

    /**
     * 静态内部类
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
