package algorithm.design.creation.BuilderPattern.dumplings.soup;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title: 番茄汤
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:50
 */
public class TomatoSoup implements Matter {
    private Integer num;
    public TomatoSoup(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "番茄汤";
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
        return "番茄汤是一道菜汤，制作原料主要有番茄、番茄酱、黄油等。番茄汤所含番茄红素有一定的抗前列腺癌和保护心脏的功效，最适合于中老年男性。";
    }
}
