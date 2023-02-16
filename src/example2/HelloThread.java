package example2;

public class HelloThread extends Thread {
    // в Java есть два основных метода для создания нового потока
    // который выполняет задачу которую вы решаете

    // 1 использую класс Thread и переписывая метод run
    @Override
    public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
        System.out.println(helloMsg);
    }

}
