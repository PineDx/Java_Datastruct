package algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl;

import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.TransportMode;
import algorithm.design.creation.FactoryPattern.transportation.Bicycle;

/**
 * Title:自行车子类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:18
 */
public class BicycleMode implements TransportMode {
    Bicycle bicycle = null;
    @Override
    public void doing(String myself, String name) {
        bicycle = new Bicycle(myself, name);
        bicycle.doing();

        //-------模拟其他业务
        System.out.println(myself+"使用" + name + "这种交通工具用时2小时到达学校");
        System.out.println("\n\n");
    }
}
