package Test.design;

import algorithm.design.creation.BuilderPattern.build.Builder;
import algorithm.design.creation.BuilderPattern.dumplings.Matter;
import algorithm.design.creation.BuilderPattern.dumplings.dippingsauce.Garlic;
import algorithm.design.creation.BuilderPattern.dumplings.dippingsauce.Vinegar;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Beef;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Cabbage;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.ChiveWithEggs;
import algorithm.design.creation.BuilderPattern.dumplings.dumpling.Mushroom;
import algorithm.design.creation.BuilderPattern.dumplings.soup.EggSoup;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/22-15:40
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        Builder builder = new Builder();

        // 套餐一
        System.out.println(builder.First().getDetail());

        // 套餐二
        System.out.println(builder.Second().getDetail());

        // 套餐三
        System.out.println(builder.Third().getDetail());

        // 自定义套餐
        List<Matter> list = new ArrayList<>();
        list.add(new Beef(10));
        list.add(new Cabbage(5));
        list.add(new ChiveWithEggs(10));
        list.add(new Mushroom(15));
        list.add(new EggSoup(10));
        list.add(new Garlic(5));
        list.add(new Vinegar(5));

        System.out.println(builder.Div(list).getDetail());
    }
}
