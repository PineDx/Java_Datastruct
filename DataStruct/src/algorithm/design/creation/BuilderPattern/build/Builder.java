package algorithm.design.creation.BuilderPattern.build;

import algorithm.design.creation.BuilderPattern.dumplings.Matter;
import algorithm.design.creation.BuilderPattern.dumplings.dippingsauce.Garlic;
import algorithm.design.creation.BuilderPattern.dumplings.dippingsauce.SpicySauce;
import algorithm.design.creation.BuilderPattern.dumplings.dippingsauce.Vinegar;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Beef;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Cabbage;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.ChiveWithEggs;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Mushroom;
import algorithm.design.creation.BuilderPattern.dumplings.soup.EggSoup;
import algorithm.design.creation.BuilderPattern.dumplings.soup.NoriSoup;
import algorithm.design.creation.BuilderPattern.dumplings.soup.TomatoSoup;

import java.util.List;

/**
 * Title: 建造者
 * Desc: 固定套餐
 *
 * @Author: Songlin
 * @create: 2020/12/22-15:22
 */
public class Builder {
    /**
     * 排名第一的饺子套餐
     * @return
     */
    public IMenu First() {
        return new MatterBuilder("皇帝御用")
                .appendDumplings(new Beef(10))
                .appendDumplings(new Cabbage(20))
                .appendDumplings(new ChiveWithEggs(25))
                .appendSoup(new NoriSoup(10))
                .appendSoup(new TomatoSoup(5))
                .appendDip(new Garlic(5))
                .appendDip(new Vinegar(5));
    }

    /**
     * 排名第二的饺子套餐
     * @return
     */
    public IMenu Second() {
        return new MatterBuilder("机械朋克")
                .appendDumplings(new ChiveWithEggs(10))
                .appendDumplings(new Beef(20))
                .appendDumplings(new ChiveWithEggs(10))
                .appendSoup(new NoriSoup(5))
                .appendSoup(new EggSoup(5))
                .appendDip(new SpicySauce(10))
                .appendDip(new Vinegar(2));
    }

    /**
     * 排名第三的饺子套餐
     * @return
     */
    public IMenu Third() {
        return new MatterBuilder("废土朋克")
                .appendDumplings(new ChiveWithEggs(20))
                .appendDumplings(new Mushroom(10))
                .appendDumplings(new Cabbage(10))
                .appendSoup(new NoriSoup(10))
                .appendSoup(new TomatoSoup(5))
                .appendDip(new Garlic(5));
    }

    /**
     * 自定义饺子套餐
     * @param list
     * @param <T>
     * @return
     */
    public <T> IMenu Div(List<T> list) {
        MatterBuilder mb = new MatterBuilder("下饭操作");
        for (T m : list) {
            mb.appendDiv((Matter)m);
        }
        return mb;
    }
}
