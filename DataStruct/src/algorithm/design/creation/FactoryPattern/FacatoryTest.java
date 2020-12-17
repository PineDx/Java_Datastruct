package algorithm.design.creation.FactoryPattern;

import algorithm.design.creation.FactoryPattern.FactoryTrans.TransportFactory;
import algorithm.design.creation.FactoryPattern.FactoryTrans.mode.TransportMode;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:32
 */
public class FacatoryTest {
    public static void main(String[] args) {
        // 使用工厂类
        TransportFactory transportFactory = new TransportFactory();

        // 获取自行车交通工具
        TransportMode bicycle = transportFactory.getTransport(TransportFactory.BICYCLE);
        bicycle.doing("御龙在天", "红旗");


        // 获取公交车交通工具
        TransportMode bus = transportFactory.getTransport(TransportFactory.BUS);
        bus.doing("凤舞九天", "大牌");

        // 获取私家车交通工具
        TransportMode car = transportFactory.getTransport(TransportFactory.CAR);
        car.doing("工厂模式", "雪佛兰");
    }
}
