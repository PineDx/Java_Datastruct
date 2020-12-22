package algorithm.design.creation.BuilderPattern.dumplings.soup;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title: 蛋花汤
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:47
 */
public class EggSoup implements Matter {
    private Integer num;

    public EggSoup(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "蛋花汤";
    }

    @Override
    public Integer num() {
        return this.num;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3.5);
    }

    @Override
    public String desc() {
        return "蛋花汤是一道以鸡蛋为主材料，将鸡蛋打碎并配以其他辅料所制成的汤品，其功效为养颜美容、消除疲劳、增进食欲。";
    }
}
