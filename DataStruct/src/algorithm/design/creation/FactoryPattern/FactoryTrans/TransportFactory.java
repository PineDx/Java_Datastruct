package algorithm.design.creation.FactoryPattern.FactoryTrans;

import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.TransportMode;
import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl.BicycleMode;
import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl.BusMode;
import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.impl.CarMode;

/**
 * Title:工厂类，获取需要使用的交通工具
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:09
 */
public class TransportFactory {

    public final static int BICYCLE = 1;
    public final static int BUS = 2;
    public final static int CAR = 3;

    public TransportMode getTransport(int mode) {
        TransportMode trans = null;
        switch (mode) {
            case BICYCLE:
                trans = new BicycleMode();
                break;
            case BUS:
                trans = new BusMode();
                break;
            case CAR:
                trans = new CarMode();
                break;
        }
        return trans;
    }
}
