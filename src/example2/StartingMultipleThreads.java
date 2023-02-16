package example2;

public class StartingMultipleThreads {
    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        Thread t2 = new HelloThread();

            t1.start();
            t2.start();
            System.out.println("finished");



    }
}
