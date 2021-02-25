package algorithm.design.creation.SingletonPattern.hungry;

import java.util.AbstractList;

/**
 * Title: 饿汉式单例
 * Desc:
 *
 * @Author: Songlin
 * @create: 2021/2/22-0:00
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 构造方法私有化
     */
    private HungrySingleton(){}

    /**
     * 提供一个全局访问点
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


}
