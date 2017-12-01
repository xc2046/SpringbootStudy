/**
 * Created by xc on 2017/8/22.
 * 匿名内部类的使用它是存在一个缺陷的，就是它仅能被使用一次
 */
public class TestIn {
    public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {
        TestIn testIn = new TestIn();
        testIn.test(new Bird() {
            @Override
            public int fly() {
                return 10000;
            }
            public String getName(){
                return "大鹏鸟";
            }
        });
    }
}
abstract class Bird{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}