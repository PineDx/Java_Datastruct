package algorithm.design.creation.BuilderPattern.dumplings.dippingsauce;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:醋料
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-11:18
 */
public class Vinegar implements Matter {
    private Integer num;
    public Vinegar(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "醋香蘸料";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(1);
    }

    @Override
    public String desc() {
        return "醋料";
    }
}
