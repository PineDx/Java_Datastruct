package algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl;

import algorithm.design.creation.AbstractFactoryPattern.product.Phone;

/**
 * Title: 苹果手机继承手机
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:51
 */
public class Applephone implements Phone {
    @Override
    public void brand() {
        System.out.println("我是苹果手机");
    }
}
