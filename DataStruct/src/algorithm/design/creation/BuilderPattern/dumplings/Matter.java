package algorithm.design.creation.BuilderPattern.dumplings;

import java.math.BigDecimal;

/**
 * Title: 饺子接口
 * Desc: 所有种类的饺子继承此接口 昨天是冬至，正好用饺子案列来实现建造者模式
 *
 * @Author: Songlin
 * @create: 2020/12/22-10:29
 */
public interface Matter {
    /**
     * 分类
      */
    String name();

    /**
     * 数量
     */
    Integer num();

    /**
     * 单价
     */
    BigDecimal price();
    /**
     * 描述
     */
    String desc();
}
