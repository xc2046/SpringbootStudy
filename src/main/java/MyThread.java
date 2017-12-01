import java.util.HashMap;
import java.util.Map;

/**
 * Created by xc on 2017/8/14.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+" : "+i);
//            Thread.yield();
        }
    }

}
class ThreadDemo{
    public static void main(String[] args) {
        MyThread tj1 = new MyThread();
        MyThread tj2 = new MyThread();
        MyThread tj3 = new MyThread();

        tj1.setName("中秋节");
        tj2.setName("国庆节");
        tj3.setName("圣诞节");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();
    }
}
