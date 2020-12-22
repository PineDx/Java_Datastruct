package algorithm.design.creation.BuilderPattern.dumplings.dumpling;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:牛肉馅饺子
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:56
 */
public class Beef implements Matter {
    private Integer num;
    public Beef(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "牛肉馅";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(5.5);
    }

    @Override
    public String desc() {
        return "牛肉馅饺子";
    }
}
