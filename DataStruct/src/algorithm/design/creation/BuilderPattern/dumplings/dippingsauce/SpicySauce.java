package algorithm.design.creation.BuilderPattern.dumplings.dippingsauce;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title: 辣酱
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-11:16
 */
public class SpicySauce implements Matter {
    private Integer num;
    public SpicySauce(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "辣酱蘸料";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1.5);
    }

    @Override
    public String desc() {
        return "辣酱蘸饺子吃的";
    }
}
