package algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl;

import algorithm.design.creation.AbstractFactoryPattern.factory.AbstractFactory;
import algorithm.design.creation.AbstractFactoryPattern.product.Charger;
import algorithm.design.creation.AbstractFactoryPattern.product.Phone;
import algorithm.design.creation.AbstractFactoryPattern.product.chargerimpl.HuaQiangCharger;
import algorithm.design.creation.AbstractFactoryPattern.product.chargerimpl.SongXiaCharger;

/**
 * Title: 充电器工厂
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-21:06
 */
public  class ChargerFactory implements AbstractFactory {
    public final static int SONGXIA = 1;
    public final static int HUAQIANG = 2;

    @Override
    public Phone getPhone(int type) {
        return null;
    }

    @Override
    public Charger getCharger(int type) {

        switch (type) {
            case SONGXIA:
                return new SongXiaCharger();
            case HUAQIANG:
                return new HuaQiangCharger();
        }
        return null;
    }
}
