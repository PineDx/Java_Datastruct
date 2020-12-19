package algorithm.design.creation.AbstractFactoryPattern.product.chargerimpl;

import algorithm.design.creation.AbstractFactoryPattern.product.Charger;

/**
 * Title: 华强北充电器继承充电器
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:53
 */
public class HuaQiangCharger implements Charger {
    @Override
    public void brand() {
        System.out.println("我是华强北的充电器");
    }
}
