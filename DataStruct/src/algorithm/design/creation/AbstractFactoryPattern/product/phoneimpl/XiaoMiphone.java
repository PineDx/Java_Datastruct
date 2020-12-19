package algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl;

import algorithm.design.creation.AbstractFactoryPattern.product.Phone;

/**
 * Title: 小米手机继承手机
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:52
 */
public class XiaoMiphone implements Phone {
    @Override
    public void brand() {
        System.out.println("我是小米手机");
    }
}
