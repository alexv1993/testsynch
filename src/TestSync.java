/**
 * Created by Alex on 10.09.2017.
 */
public class TestSync implements Runnable {
    private int balance;


    public synchronized void  run() {
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println( Thread.currentThread().getName() + " Balance equals " + balance );
        }
    }

    public void increment() {
        int i = balance;
        balance = i + 1;
    }
}
