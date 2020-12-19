package algorithm.design.creation.AbstractFactoryPattern.factory;

import algorithm.design.creation.AbstractFactoryPattern.product.Charger;
import algorithm.design.creation.AbstractFactoryPattern.product.Phone;

/**
 * Title: 抽象工厂类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:57
 */
public  interface AbstractFactory {
     // 获取手机
     public Phone getPhone(int type);
     // 获取充电器
     public Charger getCharger(int type);
}
