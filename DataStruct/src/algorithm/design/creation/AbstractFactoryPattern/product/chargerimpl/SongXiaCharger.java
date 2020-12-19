package algorithm.design.creation.AbstractFactoryPattern.product.chargerimpl;

import algorithm.design.creation.AbstractFactoryPattern.product.Charger;

/**
 * Title: 松下充电器继承充电器
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:52
 */
public class SongXiaCharger implements Charger {
    @Override
    public void brand() {
        System.out.println("我是松下的充电器");
    }
}
