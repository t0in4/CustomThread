package example3;

public class SimpleMultithreadedProgram {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new SquareWorkerThread("square-worker");
        worker.start();

        for (long i = 0; i < 5_555_555_543L; i++) {
            if (i % 1_000_000 == 0) {
                worker.join(3000);
                System.out.println("Hello from the main thread!");
            }
        }
    }
}
