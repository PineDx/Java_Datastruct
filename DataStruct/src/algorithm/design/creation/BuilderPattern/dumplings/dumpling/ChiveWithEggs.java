package algorithm.design.creation.BuilderPattern.dumplings.dumpling;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title:韭菜鸡蛋馅饺子
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:53
 */
public class ChiveWithEggs implements Matter {
    private Integer num;
    public ChiveWithEggs(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "韭菜鸡蛋馅";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3);
    }

    @Override
    public String desc() {
        return "韭菜鸡蛋馅饺子";
    }
}
