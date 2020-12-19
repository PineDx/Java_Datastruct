package algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl;

import algorithm.design.creation.AbstractFactoryPattern.product.Phone;

/**
 * Title: 华为手机继承了手机
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-20:50
 */
public class  HuaWeiphone implements Phone {
    @Override
    public void brand() {
        System.out.println("我是华为手机");
    }
}
