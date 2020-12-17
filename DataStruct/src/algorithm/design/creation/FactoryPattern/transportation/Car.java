package algorithm.design.creation.FactoryPattern.transportation;

/**
 * Title:私家车类
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/17-19:02
 */
public class Car implements Transport{
    private String myself;
    private String name;

    public Car(String myself, String name) {
        this.myself = myself;
        this.name = name;
    }
    @Override
    public void doing() {
        System.out.println(myself+"使用名叫"+name+"的私家车愉快的去上学");
    }
}
