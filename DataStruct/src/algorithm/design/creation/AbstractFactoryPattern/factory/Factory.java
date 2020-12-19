package algorithm.design.creation.AbstractFactoryPattern.factory;

import algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl.ChargerFactory;
import algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl.PhoneFactory;

/**
 * Title: 生产工厂
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-21:14
 */
public class Factory {
    public final static int PHONE = 1;
    public final static int CHARGER = 2;
    public static AbstractFactory getFactory(int type) {
        switch (type) {
            case PHONE:
                return new PhoneFactory();
            case CHARGER:
                return new ChargerFactory();
        }
        return null;
    }
}
