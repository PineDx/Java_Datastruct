package algorithm.design.creation.BuilderPattern.build;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Title: 将不同产品构建在一起
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-14:22
 */
public class MatterBuilder implements IMenu{
    private List<Matter> menus = new ArrayList<Matter>();
    private String name;
    private BigDecimal price =  BigDecimal.ZERO;;

    public MatterBuilder(String name) {
        this.name = name;
    }
    @Override
    public IMenu appendDumplings(Matter matter) {
        menus.add(matter);
        price = price.add(matter.price().multiply(new BigDecimal(matter.num())));
        return this;
    }

    @Override
    public IMenu appendSoup(Matter matter) {
        menus.add(matter);
        price = price.add(matter.price().multiply(new BigDecimal(matter.num())));
        return this;
    }

    @Override
    public IMenu appendDip(Matter matter) {
        menus.add(matter);
        price = price.add(matter.price().multiply(new BigDecimal(matter.num())));
        return this;
    }

    @Override
    public IMenu appendDiv(Matter matter) {
        menus.add(matter);
        price = price.add(matter.price().multiply(new BigDecimal(matter.num())));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "账单清单：" +this.name +  "\r\n");

        for (Matter matter: menus) {
            detail.append("菜品:"+matter.name())
                    .append("\t\n数量:"+matter.num())
                    .append("\t\n单价" + matter.price() +"\n");
        }
        detail.append("总价:" + price);

        return detail.toString();
    }
}
