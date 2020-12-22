package algorithm.design.creation.BuilderPattern.dumplings.dumpling;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:香菇馅饺子
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:58
 */
public class Mushroom implements Matter {
    private Integer num;
    public Mushroom(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "香菇馅";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(4);
    }

    @Override
    public String desc() {
        return "香菇馅饺子";
    }
}
