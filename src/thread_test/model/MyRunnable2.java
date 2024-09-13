package thread_test.model;

public class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello2");
        System.out.println("Bye2");
    }
}
