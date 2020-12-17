package algorithm.design.creation.FactoryPattern.transportation;

/**
 * Title:公交车类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:00
 */
public class Bus implements Transport{
    private String myself;
    private String name;

    public Bus(String myself, String name) {
        this.myself = myself;
        this.name = name;
    }
    @Override
    public void doing() {
        System.out.println(myself+"使用名叫"+name+"的公交车轻松的去上学");
    }
}
