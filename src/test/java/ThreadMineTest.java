import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by xc on 2017/8/18.
 */
public class ThreadMineTest {

    @Test
    public void test() throws InterruptedException {
        final ThreadMine test = new ThreadMine();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.testWait();
                }
            }).start();
        }

        synchronized (test) {
            test.notify();
        }
        Thread.sleep(3000);
        System.out.println("-----------分割线-------------");

        synchronized (test) {
            test.notifyAll();
        }
    }

    @Test
    public void testWait() {
        final Wait test = new Wait();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.testWait();
                Thread.yield();
            }

        }).start();

    }

    @Test
    public void testIp(){
        try {
            InetAddress in = InetAddress.getLocalHost();
            System.out.println(in.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    /* 求1000以内的完全数有哪些
    如果一个数恰好等于它的因子之和，则称该数为“完全数”，又称完美数或完备数。
例如：第一个完全数是6，它有约数1、2、3、6，除去它本身6外，其余3个数相加，1+2+3=6。
第二个完全数是28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
*/

    @Test
    public void suanfa(){
        int k = 1000;
        for (int j = 1; j < k; j++) {
            int sum =0;
            for (int i = 1; i < j; i++) {
                if (j%i ==0){
                    sum +=i;
                }
            }
            if (sum==j){
                System.out.println();
                System.out.println("sum="+sum);
            }
        }

    }

    @Test
    public void sanjiao(){
//        int i = 9;
//        for (int j = 0; j < 9; j++) {
//            for (int k = 0; k < j; k++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        System.out.println("3%1="+3%1);
        System.out.println("3%3="+3%3);
    }

    /*判断101-200之间有多少个素数，并输出所有素数
    * 3: 1,3     2: 1,2
    * */
    @Test
    public void count1(){
        for (int i = 101; i < 201; i++) {
            int temp = 0;
            int sum = 0;
            for (int j = 1; j < i+1; j++) {
                  if(i/j!=2){
                    temp = sum++;
                }
            }
                System.out.println(i);
        }
    }


}
