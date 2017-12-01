/**
 * Created by xc on 2017/8/18.
 */
public class ThreadMine {
    public synchronized void testWait(){
        System.out.println(Thread.currentThread().getName() +" Start-----");

        try {
            wait(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" End-------");

    }

}
