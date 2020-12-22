package algorithm.design.creation.BuilderPattern.dumplings.soup;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

import java.math.BigDecimal;

/**
 * Title: 紫菜汤
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:42
 */
public class NoriSoup implements Matter {

    private Integer num;

    public NoriSoup(int num) {
        this.num = num;
    }
    @Override
    public String name() {
        return "紫菜汤";
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
        return "紫菜汤，是一道菜肴。补碘又补钙。紫菜的碘含量非常丰富，几乎是粮食和蔬菜的100倍！此外，紫菜含的铁和维生素B12也很丰富，它们都是造血所必需的营养素。虾皮含钙丰富，两者配伍相得益彰，对缺铁性贫血、骨质疏松症有一定效果。";
    }
}
