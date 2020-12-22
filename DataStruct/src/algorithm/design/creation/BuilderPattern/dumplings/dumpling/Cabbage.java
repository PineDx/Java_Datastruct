package algorithm.design.creation.BuilderPattern.dumplings.dumpling;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:白菜馅饺子
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-11:01
 */
public class Cabbage implements Matter {
    private Integer num;
    public Cabbage(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "白菜馅";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2.5);
    }

    @Override
    public String desc() {
        return "白菜馅饺子";
    }
}
