package Test.design;

import algorithm.design.creation.AbstractFactoryPattern.factory.AbstractFactory;
import algorithm.design.creation.AbstractFactoryPattern.factory.Factory;
import algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl.ChargerFactory;
import algorithm.design.creation.AbstractFactoryPattern.factory.factoryimpl.PhoneFactory;
import algorithm.design.creation.AbstractFactoryPattern.product.Charger;
import algorithm.design.creation.AbstractFactoryPattern.product.Phone;


/**
 * Title: 抽象工厂测试类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/19-21:21
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {

        System.out.println("手机工厂产出的三款手机品牌");
        AbstractFactory phoneFactory = Factory.getFactory(Factory.PHONE);
        Phone appphone = phoneFactory.getPhone(PhoneFactory.APPLE);
        appphone.brand();
        Phone huaweiphone = phoneFactory.getPhone(PhoneFactory.HUAWEI);
        huaweiphone.brand();
        Phone xiaomiphone = phoneFactory.getPhone(PhoneFactory.XIAOMI);
        xiaomiphone.brand();


        System.out.println("充电器工厂产出的两款充电器品牌");
        AbstractFactory chargerFactory = Factory.getFactory(Factory.CHARGER);
        Charger songxiacharger = chargerFactory.getCharger(ChargerFactory.SONGXIA);
        songxiacharger.brand();
        Charger huaqiangcharger = chargerFactory.getCharger(ChargerFactory.HUAQIANG);
        huaqiangcharger.brand();
    }
}
