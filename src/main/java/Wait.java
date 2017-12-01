/**
 * Created by xc on 2017/8/18.
 */
public class Wait {
    public synchronized  void testWait() {
        System.out.println("Start-----");
        try {
            wait(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End-------");
    }
}
