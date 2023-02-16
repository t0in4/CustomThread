package example1;

import java.util.StringTokenizer;

public class HelloThread2 implements Runnable {

    // 2 воплощаем интерфейс Runnable и передавая
    // воплощение в конструктор класса Thread
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg = String.format("Hello, i'm %s", threadName);
        System.out.println(helloMsg);
    }
}
