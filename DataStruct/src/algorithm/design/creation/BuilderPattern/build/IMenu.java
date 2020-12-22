package algorithm.design.creation.BuilderPattern.build;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;

/**
 * Title: 饺子菜单套餐接口
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-11:26
 */
public interface IMenu {
    /**
     * 添加饺子种类
     * @param matter
     * @return
     */
    IMenu appendDumplings(Matter matter);

    /**
     * 添加餐后汤种类
     * @param matter
     * @return
     */
    IMenu appendSoup(Matter matter);

    /**
     * 添加蘸料种类
     * @param matter
     * @return
     */
    IMenu appendDip(Matter matter);

    /**
     * 自定义套餐
     * @param matter
     * @return
     */
    IMenu appendDiv(Matter matter) ;
    /**
     * 获取菜单明细
     * @return
     */
    String getDetail();
}
