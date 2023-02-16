package example1;

public class Example1 {

    public static void main(String[] args) {
        Thread t1 = new HelloThread1(); // подкласс класса Thread
        //System.out.println(t1.getName());
        t1.start();
        Thread t2 = new Thread(new HelloThread2()); // передаем в конструктор runnable
        //System.out.println(t2.getName());
        t2.start();

        // можно переименовать имя потока передав его в конструктор
        Thread myThread = new Thread(new HelloThread2(), "my_thread");
        //System.out.println(myThread.getName());
        myThread.start();

        // и можно сделать это с лямбда выражением
        Thread t3 = new Thread(() -> {
            System.out.println(String.format("Hello, i'm %s", Thread.currentThread().getName()));
        });
        t3.start();

    }
}
