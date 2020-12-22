package algorithm.design.creation.BuilderPattern.dumplings.dippingsauce;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:蒜香蘸料
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-11:22
 */
public class Garlic implements Matter {
    private Integer num;
    public Garlic(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "蒜香蘸料";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2);
    }

    @Override
    public String desc() {
        return "蒜香蘸料";
    }
}
