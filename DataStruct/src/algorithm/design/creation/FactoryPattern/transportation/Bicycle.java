package algorithm.design.creation.FactoryPattern.transportation;

/**
 * Title:自行车类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-18:51
 */
public class Bicycle implements Transport {

    private String myself;
    private String name;

    public Bicycle(String myself, String name) {
        this.myself = myself;
        this.name = name;
    }
    @Override
    public void doing() {
        System.out.println(myself+"使用名叫"+name+"的自行车费力的去上学");
    }
}
