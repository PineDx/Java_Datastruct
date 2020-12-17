package algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl;

import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.TransportMode;
import algorithm.design.creation.FactoryPattern.transportation.Car;

/**
 * Title:私家车子类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:19
 */
public class  CarMode implements TransportMode {
    Car car = null;
    @Override
    public void doing(String myself, String name) {
        car = new Car(myself, name);
        car.doing();

        //-------模拟其他业务
        System.out.println(myself+"使用" + name + "这种交通工具用时20分钟到达学校");
        System.out.println("\n\n");
    }
}
