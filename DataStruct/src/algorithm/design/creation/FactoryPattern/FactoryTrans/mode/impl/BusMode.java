package algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl;

import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.TransportMode;
import algorithm.design.creation.FactoryPattern.transportation.Bus;

/**
 * Title:公交车子类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:19
 */
public class BusMode implements TransportMode {
    Bus bus = null;
    @Override
    public void doing(String myself, String name) {
        bus = new Bus(myself,name);
        bus.doing();

        //-------模拟其他业务
        System.out.println(myself+"使用" + name + "这种交通工具用时1小时到达学校");
        System.out.println("\n\n");
    }
}
