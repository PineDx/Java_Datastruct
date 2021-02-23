package algorithm.design.creation.SingletonPattern.hungry;

/**
 * Title:饿汉式静态单例
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/22-0:03
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;


    static {
        hungrySingleton = new HungryStaticSingleton();
    }


    /**
     * 构造方法私有化
     */
    private HungryStaticSingleton(){}


    /**
     * 提供一个全局访问点
     */
    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
