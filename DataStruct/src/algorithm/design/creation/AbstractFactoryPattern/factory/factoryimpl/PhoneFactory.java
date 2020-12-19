package algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl;

import algorithm.design.creation.AbstractFactoryPattern.factory.AbstractFactory;
import algorithm.design.creation.AbstractFactoryPattern.product.Charger;
import algorithm.design.creation.AbstractFactoryPattern.product.Phone;
import algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl.Applephone;
import algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl.HuaWeiphone;
import algorithm.design.creation.AbstractFactoryPattern.product.phoneimpl.XiaoMiphone;

/**
 * Title: 手机工厂
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-21:01
 */
public  class PhoneFactory implements AbstractFactory {
    public final static int HUAWEI = 1;
    public final static int APPLE = 2;
    public final static int XIAOMI = 3;
    @Override
    public Phone getPhone(int type) {

        switch (type) {
            case HUAWEI:
                return new HuaWeiphone();
            case APPLE:
                return new Applephone();
            case XIAOMI:
                return new XiaoMiphone();
        }
        return null;
    }

    @Override
    public Charger getCharger(int type) {
        return null;
    }
}
